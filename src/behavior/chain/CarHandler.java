package behavior.chain;

/**
 * 定义一个处理业务的请求的抽象类
 *
 * 这里不能是接口，接口的成员变量都是 static final的
 *
 * @author Karl Jin
 * @create 2019-06-03 09:50
 */
public abstract class CarHandler {
    // 定义下一个要执行的handler
    protected CarHandler carHandler;

    public CarHandler setCarHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public abstract void handlerCar();

}
