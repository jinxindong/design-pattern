package struct.wrapper;

/**
 * 装饰模式
 * 解释：在不改变类的情况下，动态的扩展一个对象的功能。
 * <p>
 * 优点：扩展功能且装饰类和原始类不会相互耦合
 * 缺点：多层装饰比较复杂 层层嵌套，逻辑不容易理清楚
 * <p>
 * <p>
 * 代理模式和装饰模式的区别：
 * 装饰模式强调功能扩展 A对象的B方法，运用装饰模式后，在调用B方法前后，实现新的功能，此时B方法效果与原来不同
 * <p>
 * 代理模式强调控制访问 运用代理模式后，在调用B方法前后，控制怎么访问B方法的原始数据，而对于B实现的功能效果不做修改
 *
 * @author Karl Jin
 * @create 2019-05-29 09:32
 */

public class Main {

    public static void main(String[] args) {
        Car luxuryCar = new LuxuryCar();
        Car car = new LuxuryCarWrapper(luxuryCar);
        car.show();

    }
}
