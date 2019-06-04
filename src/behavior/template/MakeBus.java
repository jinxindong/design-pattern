package behavior.template;

/**
 * @author Karl Jin
 * @create 2019-06-04 09:48
 */

public class MakeBus extends MakeCar {
    @Override
    public void makeHead() {
        System.out.println("制造bus车头");
    }

    @Override
    public void makeBody() {
        System.out.println("制造bus车身");
    }

    @Override
    public void makeTail() {
        System.out.println("制造bus车尾");
    }
}
