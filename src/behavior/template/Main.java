package behavior.template;

/**
 * 模板方法模式
 *
 * 解释：把具有特定步骤算法的某些必要处理，委托给抽象方法。
 * 通过子类继承对抽象方法的不同实现改变整个算法的行为
 *
 * 优点：抽象类定义了一组算法，将具体实现交给子类，扩展性强
 *      这是一种代码复用
 *
 * 缺点：每一个不同的实现，都需要一个子类来实现，导致类的个数增加
 *
 * 应用条件：
 * 具有统一的操作步骤或操作过程
 * 具有不同的操作细节
 * 存在多个具有同样操作步骤的应用场景，但某些具体的操作细节却各不相同
 *
 * @author Karl Jin
 * @create 2019-06-03 12:56
 */

public class Main {
    public static void main(String[] args) {
        MakeCar makeCar = new MakeBus();
        makeCar.make();
    }
}
