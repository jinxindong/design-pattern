package create.singleton;

/**
 * 保证效率和安全的懒汉式加载方式
 *
 * @author Karl Jin
 * @create 2019-05-26 18:44
 */

public class Singleton {
    /**
     * 构造函数
     */
    private Singleton() {
    }

    /**
     * 类级的内部类，也就是静态的成员内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现延时加载
     */
    private static class SingletonHolder {
        /**
         * 静态初始化器 由JVM来保证线程安全
         */
        private static Singleton instance = new Singleton();
    }


    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

}
