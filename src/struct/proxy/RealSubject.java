package struct.proxy;

/**
 * @author Karl Jin
 * @create 2019-05-29 13:57
 */

public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("打开书本");
    }
}
