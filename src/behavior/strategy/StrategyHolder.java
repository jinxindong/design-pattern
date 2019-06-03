package behavior.strategy;

/**
 * 环境类角色
 * 持有一个抽象策略的引用给客户端调用。
 *
 * @author Karl Jin
 * @create 2019-06-03 12:40
 */

public class StrategyHolder {
    private Strategy strategy;

    public StrategyHolder(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execEncrypt() {
        strategy.encrypt();
    }
}
