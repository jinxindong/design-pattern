package behavior.state;

/**
 * Context（上下文）是一个类，它可以拥有一些内部状态
 * 房间的几个状态和当前状态
 * 构造房间的时候需要一个初始化状态
 * 该房间可以进行的几个行为
 *
 * @author Karl Jin
 * @create 2019-06-05 10:41
 */

public class Context {

    private final State freeTimeState = new FreeTimeState(this);//空闲状态
    private final State checkInState = new CheckInState(this); //入住状态
    private final State bookedState = new BookedState(this); //预订状态

    public State state;//当前状态

    public Context() {
        this.state = freeTimeState;// 初始化状态为空闲
    }

    /**
     * @return void
     * @desc 预订房间
     */
    public void bookRoom() {
        state.bookRoom();
    }

    /**
     * @return void
     * @desc 退订房间
     */
    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    /**
     * @return void
     * @desc 入住
     */
    public void checkInRoom() {
        state.checkInRoom();
    }

    /**
     * @return void
     * @desc 退房
     */
    public void checkOutRoom() {
        state.checkOutRoom();
    }


    public String toString() {
        return "该房间的状态是:" + getState().getClass().getName();
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getFreeTimeState() {
        return freeTimeState;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public State getBookedState() {
        return bookedState;
    }
}
