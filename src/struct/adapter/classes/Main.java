package struct.adapter.classes;

/**
 * 适配器模式：类适配器 继承类
 * 解释：已经有了一个usb接口，但客户端需要ps2格式的接口，那么继承usb 实现ps2即可。
 *
 * @author Karl Jin
 * @create 2019-05-30 09:37
 */

public class Main {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter();
        ps2.idPs2();
    }
}
