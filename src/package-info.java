/**
 * @author Karl Jin
 * @create 2019-05-20 17:20
 *
 * 最近在撸 Netty 源码，发现了一些模式。
 *
 * 分析版本是4.0
 *
 * 1. 构造器模式
 * ServerBootstrap 和 Bootstrap 的构建
 *
 * 2. 责任链设计模式
 * pipeline 上事件的传播
 *
 * 3. 工厂模式
 * Channel 的实例化过程
 *
 * 4. 对象池
 * 对线程池的应用，ByteBuf内存池
 *
 * 5. Reactor 模式的使用
 * Netty 底层事件的收发机制是多线程的 Reactor 模式的应用。
 *
 * 6. 模板模式
 * ServerBootstrap 和 Bootstrap 继承 AbstractBootstrap 父类抽象类，并实现init() 和clone()方法。
 *
 *
 */
