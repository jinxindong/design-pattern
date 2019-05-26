package create.factory.abstractFactory;

/**
 * @author Karl Jin
 * @create 2019-05-26 20:38
 */

public class NorthBanana extends Banana{
    @Override
    public void get() {
        System.out.println("获取抽象北方香蕉实例");
    }
}
