package behavior.chain;

/**
 * @author Karl Jin
 * @create 2019-06-03 09:58
 */

public class BodyCarHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("组装车身");
        if (this.carHandler != null) {
            this.carHandler.handlerCar();
        }
    }
}
