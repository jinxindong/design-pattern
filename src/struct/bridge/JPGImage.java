package struct.bridge;

/**
 * @author Karl Jin
 * @create 2019-05-31 09:58
 */

public class JPGImage extends Image{
    public JPGImage(SystemOp systemOp) {
        super(systemOp);
    }

    @Override
    public void parseFile() {
        System.out.println("JPG格式");
        systemOp.show();
    }
}
