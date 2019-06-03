package behavior.strategy;

/**
 * @author Karl Jin
 * @create 2019-06-03 12:38
 */

public class MD5Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("执行MD5加密策略");
    }
}
