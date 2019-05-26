package create.factory.factoryMethod;

/**
 * @author Karl Jin
 * @create 2019-05-26 20:16
 */

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
