package struct.adapter.classes;

/**
 * 已经存在的类，但外界需要的不是这个类的格式。
 * 所以需要一个适配器来持有这个类，从而能够调用这个类的方法
 *
 * @author Karl Jin
 * @create 2019-05-30 09:38
 */

public class Usber {
    public void idUsb() {
        System.out.println("这是一个usb接口-对象持有模式");
    }
}
