package create.factory.factoryMethod;

/**
 * 工厂方法模式
 *
 * 解释：每个产品都有自己的产品工厂
 *
 * 优点：新加产品不用修改老代码，只需要新增代码
 * 缺点：不同的产品多的话，类会非常的多
 *
 * @author Karl Jin
 * @create 2019-05-26 20:17
 */
public class Main {

    public static void main(String[] args) {
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.get();

        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.get();
    }

}
