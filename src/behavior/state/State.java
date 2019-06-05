package behavior.state;

/**
 * 可以是接口  也可以是抽象类
 * 定义事件，出发一个状态后 会发生一些事件
 *
 * 空闲状态：可预订和入住
 * 已预订状态：可入住和取消
 * 已入住状态：可退房
 *
 * @author Karl Jin
 * @create 2019-06-05 12:55
 */
public abstract class State {

    /**
     * @return void
     * @desc 预订房间
     */
    public abstract void bookRoom();

    /**
     * @return void
     * @desc 退订房间
     */
    public abstract void unsubscribeRoom();

    /**
     * @return void
     * @desc 入住
     */
    public abstract void checkInRoom();

    /**
     * @return void
     * @desc 退房
     */
    public abstract void checkOutRoom();

}
