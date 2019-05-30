package struct.adapter.interfaces;


/**
 * 适配器模式：接口适配器
 *
 * 解释：
 * 当存在这样一个接口Ps2，其中定义了N多的方法，而我们现在却只想使用其中的一个到几个方法，
 * 如果我们直接实现接口，那么我们要对所有的方法进行实现，哪怕我们仅仅是对不需要的方法进行置空
 * （只写一对大括号，不做具体方法实现）也会导致这个类变得臃肿，调用也不方便，
 * 这时我们可以使用一个抽象类作为中间件，即适配器，用这个抽象类实现接口，
 * 而在抽象类中所有的方法都进行置空，那么我们在创建抽象类的继承类，
 * 而且重写我们需要使用的那几个方法即可。
 *
 * @author Karl Jin
 * @create 2019-05-30 09:37
 */

public class Main {
    public static void main(String[] args) {
        Ps2 ps2 =  new Ps2Detail();
        ps2.idPs2A();
        ps2.idPs2E();
    }
}
