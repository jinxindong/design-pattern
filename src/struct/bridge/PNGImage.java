package struct.bridge;

/**
 * @author Karl Jin
 * @create 2019-05-31 09:58
 */

public class PNGImage extends Image {
    public PNGImage(SystemOp systemOp) {
        super(systemOp);
    }

    @Override
    public void parseFile() {
        System.out.println("PNG格式");
        systemOp.show();
    }
}
