package behavior.chain;

/**
 * @author Karl Jin
 * @create 2019-06-03 10:01
 */

public class TailCarHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("组装汽车尾部");
        if (this.carHandler != null) {
            this.carHandler.handlerCar();
        }
    }
}
