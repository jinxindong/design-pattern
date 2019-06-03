package behavior.strategy;

/**
 * 策略模式
 * 解释：
 *  将算法封装到共同接口中，从而使得可以相互替换，而不影响客户端。将算法的职责和算法本身分割开来。
 *  核心不是如何实现算法，而是如何组织和调用这些算法。从而使程序结构更灵活，更具有扩展性和维护性。
 *
 * <p>
 * 优点：提供了管理相关算法族的办法；避免过多的使用 if-else语句。多重条件语句不易维护。
 *
 * 缺点：客户端必须知道算有的策略类，并自行决定使用哪一个策略类。意味着客户端必须理解这些算法的使用和区别。
 *      策略模式把每个具体的策略的实现都封装成为类，如果备案的策略很多的话，那么类的数量就会很多。
 *
 *
 * @author Karl Jin
 * @create 2019-06-03 12:32
 */

public class Main {

    public static void main(String[] args) {
        // 可以利用单例 工厂模式生产加密策略
        Strategy md5Strategy = new MD5Strategy();
        Strategy kmsStrategy = new KMSStrategy();


        // 执行具体的加密策略
        StrategyHolder strategyHolder = new StrategyHolder(md5Strategy);
        strategyHolder.execEncrypt();
    }
}
