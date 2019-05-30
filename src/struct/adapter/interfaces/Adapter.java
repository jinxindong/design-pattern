package struct.adapter.interfaces;

/**
 * 使用一个抽象类作为中间件，即适配器，用这个抽象类实现接口，
 * 而在抽象类中所有的方法都进行置空，那么我们在创建抽象类的继承类
 * @author Karl Jin
 * @create 2019-05-30 09:51
 */

public abstract class Adapter implements Ps2{
    @Override
    public void idPs2A() {

    }

    @Override
    public void idPs2C() {

    }

    @Override
    public void idPs2D() {

    }

    @Override
    public void idPs2E() {

    }

    @Override
    public void idPs2F() {

    }
}
