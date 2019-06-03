package behavior.strategy;

/**
 * @author Karl Jin
 * @create 2019-06-03 12:38
 */

public class KMSStrategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("执行KMS加密策略");
    }
}
