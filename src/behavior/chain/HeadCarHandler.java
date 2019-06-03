package behavior.chain;

/**
 * @author Karl Jin
 * @create 2019-06-03 09:54
 */

public class HeadCarHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("组装车辆的头");
        if (this.carHandler != null) {
            this.carHandler.handlerCar();
        }
    }
}
