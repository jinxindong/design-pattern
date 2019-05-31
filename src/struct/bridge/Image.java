package struct.bridge;

/**
 * 已存在多种操作系统的情况下，定义抽象图像类
 * 抽象类持有操作系统的抽象接口
 *
 * @author Karl Jin
 * @create 2019-05-31 09:48
 */

public abstract class Image {
    protected SystemOp systemOp;

    public Image(SystemOp systemOp) {
        this.systemOp = systemOp;
    }

    public abstract void parseFile();

}
