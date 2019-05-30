package struct.facade;

/**
 * @author Karl Jin
 * @create 2019-05-30 20:42
 */

public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        this.systemA = new SystemA();
        this.systemB = new SystemB();
        this.systemC = new SystemC();
    }

    public void takeAB() {
        systemA.takeA();
        systemB.takeB();
    }
}
