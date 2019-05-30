package struct.adapter.object;

/**
 * 适配器模式：对象适配器    持有对象
 * 解释：解释：已经有了一个usb接口，但客户端需要ps2格式的接口，那么持有usb 实现ps2即可。
 *
 * @author Karl Jin
 * @create 2019-05-30 09:21
 */

public class Main {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.idPs2();
    }
}
