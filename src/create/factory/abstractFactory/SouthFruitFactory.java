package create.factory.abstractFactory;

/**
 * @author Karl Jin
 * @create 2019-05-26 20:42
 */

public class SouthFruitFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
