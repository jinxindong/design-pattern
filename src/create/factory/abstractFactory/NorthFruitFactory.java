package create.factory.abstractFactory;

/**
 * @author Karl Jin
 * @create 2019-05-26 20:41
 */

public class NorthFruitFactory  implements  FruitFactory{
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
