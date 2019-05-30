package struct.adapter.object;

/**
 * 适配器 持有一个已有的类的数据格式，同时实现对外暴露的接口。
 *
 * @author Karl Jin
 * @create 2019-05-30 09:39
 */
public class Adapter implements Ps2 {
    private Usber usber;

    public Adapter(Usber usber) {
        this.usber = usber;
    }

    @Override
    public void idPs2() {
        usber.idUsb();
    }
}
