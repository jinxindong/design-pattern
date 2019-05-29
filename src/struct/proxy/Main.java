package struct.proxy;

/**
 * 代理模式
 * 解释：用来增强目标对象或者保护目标对象。为对象提供一种代理，以控制这个对象
 *
 * 优点：一定程度上降低可系统的耦合度，扩展好
 * 缺点：会造成类目增加
 *
 * @author Karl Jin
 * @create 2019-05-29 14:00
 */

public class Main {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.sailBook();
    }
}
