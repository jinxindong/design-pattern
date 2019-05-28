package create.builder;

/**
 * 建造者模式
 * 解释：将对象的表现和生产过程分割开来。多种builder作为一个操作集合 可以有多种builder
 *      这样可以产生有多种不同成分的对象。
 *
 * 优点：客户端可以不用知道生产的细节；建造者之间相互独立有利于扩展；
 * 缺点：产品之间差异化很大不适合该模式；产品内部变化复杂，可能导致多个builder来实现变化，导致系统膨胀。
 *
 * 例子：保险合同可以和个人 也可以和公司签订，但一份合同不能同时同公司和个人签订
 * 可以有两种builder 对应两种不同的功能。
 * 建造者可以合并到产品对象中。并将构造函数私有化，防止客户端直接new
 *
 * @author Karl Jin
 * @create 2019-05-26 22:18
 */

public class Main {
    // 客户端负责指定导演类和具体建造者，然后让导演操作建造者建造
    public static void main(String[] args) {
        // 1、客户直接造房子
        House house = new House();
        house.setHousetop("客户组装屋顶");
        house.setWall("客户组装墙");
        house.setFloor("客户组装地板");


        // 2、房子结构和建造过程分离  builder对具体成分进行操作
        HouseBuilder houseBuilder = new GongyuHouseBuilder();
        // 导演类进行调用这些操作的集合
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        houseDirector.makeHouse();

        House house1 = houseBuilder.getHouse();

        System.out.println(house1.getFloor());
        System.out.println(house1.getWall());
        System.out.println(house1.getHousetop());


    }
}
