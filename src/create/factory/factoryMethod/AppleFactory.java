package create.factory.factoryMethod;

/**
 * @author Karl Jin
 * @create 2019-05-26 20:14
 */

public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return  new Apple();
    }
}
