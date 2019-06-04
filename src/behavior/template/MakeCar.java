package behavior.template;

/**
 * @author Karl Jin
 * @create 2019-06-04 09:45
 */

public abstract class MakeCar {

    public abstract void makeHead();

    public abstract void makeBody();

    // 抽象方法
    public abstract void makeTail();

    // 钩子方法
    public void make() {
        this.makeHead();
        this.makeBody();
        this.makeTail();
    }

}
