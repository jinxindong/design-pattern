package struct.facade;

/**
 * 门面模式（外观模式）
 * 解释：封装交互 简化调用
 *
 * 优点：解耦了客户端和子系统之间的耦合关系，层次分明，让子系统更加容易扩展。
 * 缺点：
 * @author Karl Jin
 * @create 2019-05-30 20:31
 */

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.takeAB();
    }
}
