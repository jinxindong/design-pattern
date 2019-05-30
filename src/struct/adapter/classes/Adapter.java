package struct.adapter.classes;

/**
 * 适配器继承已有的类的数据格式，同时实现对外暴露的接口。
 *
 * @author Karl Jin
 * @create 2019-05-30 09:39
 */
public class Adapter extends Usber implements Ps2 {
    @Override
    public void idPs2() {
        this.idUsb();
    }
}
