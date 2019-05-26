package create.factory.abstractFactory;

/**
 * 抽象工厂模式
 *
 * 解释：苹果香蕉不同产品 南方北方不同产品族
 *      向外提供水果工厂接口，提供北方的香蕉和苹果
 *      但现在别人需要南方的香蕉和苹果，此时别人不需要改代码。
 *      达到了接口相互依赖，具体实现不用相互依赖
 *
 * 优点：实现接口依赖，不依赖具体实现
 * 缺点：代码接口比较复杂，不容易理解
 * @author Karl Jin
 * @create 2019-05-26 20:44
 */

public class Main {
    public static void main(String[] args) {
        FruitFactory northFruitFactory = new NorthFruitFactory();
        Fruit northApple = northFruitFactory.getApple();
        Fruit northBanana = northFruitFactory.getBanana();

        northApple.get();
        northBanana.get();

        System.out.println("");
        System.out.println("");

        FruitFactory southFruitFactory = new SouthFruitFactory();
        Fruit southApple = southFruitFactory.getApple();
        Fruit southBanana = southFruitFactory.getBanana();

        southApple.get();
        southBanana.get();
    }
}
