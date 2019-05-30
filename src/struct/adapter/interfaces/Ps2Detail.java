package struct.adapter.interfaces;

/**
 * 只实现自己想要实现的方法  可以不用全部都实现
 *
 * @author Karl Jin
 * @create 2019-05-30 09:54
 */

public class Ps2Detail extends Adapter{
    @Override
    public void idPs2A() {
        System.out.println("实现的idPs2A被调用");
    }

    @Override
    public void idPs2E() {
        System.out.println("实现的idPs2E被调用");
    }
}
