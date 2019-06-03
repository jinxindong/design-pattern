package behavior.chain;

/**
 * 职责链模式(任链模式)
 * 解释：
 * 关联一串能够处理事务的对象，使一个请求可以被多个对象都有机会处理。
 * 每个对象都完成自己的职责。大
 *
 * <p>
 * 优点：责任的分担，每个类秩序需要处理自己该处理的工作
 * 可以根据自由组合工作流程
 * 类与类之间可以以松耦合的形式加以组织
 *
 * 缺点：因为处理时以链的形式在对象间传递，根据实现方式不同，有可能影响处理的速度
 *
 * @author Karl Jin
 * @create 2019-06-03 09:40
 */
public class Main {
    public static void main(String[] args) {
        CarHandler carHandler = new HeadCarHandler();
        CarHandler bodyCarHandler = new BodyCarHandler();
        CarHandler tailCarHandler = new TailCarHandler();

        // 组装的顺序
        carHandler.setCarHandler(bodyCarHandler);
        bodyCarHandler.setCarHandler(tailCarHandler);
        // 调用责任链的头
        carHandler.handlerCar();

        System.out.println("-----------------------------------");

        carHandler.setCarHandler(new TailCarHandler())
                .setCarHandler(new BodyCarHandler());
        carHandler.handlerCar();


    }
}
