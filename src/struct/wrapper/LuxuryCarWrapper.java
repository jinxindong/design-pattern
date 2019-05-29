package struct.wrapper;

/**
 * 装饰类 用来扩展方法功能
 * @author Karl Jin
 * @create 2019-05-29 09:43
 */

public class LuxuryCarWrapper implements Car {
    private Car luxuryCar;

    public LuxuryCarWrapper(Car luxuryCar) {
        this.luxuryCar = luxuryCar;
    }

    @Override
    public void show() {
        update();
        luxuryCar.show();
    }


    public void update() {
        System.out.println("给车增加了1个座位");
    }
}
