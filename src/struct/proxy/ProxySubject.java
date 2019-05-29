package struct.proxy;

/**
 * @author Karl Jin
 * @create 2019-05-29 13:58
 */

public class ProxySubject implements Subject {
    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void sailBook() {
        System.out.println("代理一下然后走正式方法");
        realSubject.sailBook();
    }
}
