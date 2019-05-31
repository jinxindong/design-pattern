package struct.flyweight;

/**
 * 享元设计模式
 * 解释:主要实现对象的共享。目的是节省内存，从而改善内存性能
 *  是单例模式+工厂模式的组合
 *
 * 内部状态:对象可共享出来的信息，存储在享元对象内部并且不会随环境的改变而改变。
 * 外部状态:对象依赖的一个标记是随环境改变而改变的,并且不可共享。
 *
 * 优点：极大减少内存中对象的数量，提高系统性能
 * 缺点：使得系统变得复杂 需要分离出内部状态和外部状态 使逻辑复杂
 *
 * @author Karl Jin
 * @create 2019-05-31 13:13
 */

public class Main {
    public static void main(String[] args) {
        Teacher teacher = TeacherFactory.getTeacher("jin");
        teacher.doSomehing();
    }
}
