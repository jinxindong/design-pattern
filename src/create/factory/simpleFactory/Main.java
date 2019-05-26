package create.factory.simpleFactory;

/**
 * 简单工厂模式
 *
 * 解释：一个工厂生产 各种同个接口产品
 *
 * 优点：简单，好理解。只要有新增产品只要修改一处即可
 * 缺点：如果产品多，需要写的代码就很多。耦合性比较高
 *
 * @author Karl Jin
 * @create 2019-05-26 19:16
 */

public class Main {
    public static void main(String[] args) {
        Fruit apple = Factory.getFruit("apple");
        Fruit banana = Factory.getFruit("banana");
        apple.get();
        banana.get();
    }
}
