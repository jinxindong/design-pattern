package behavior.state;

/**
 * @author Karl Jin
 * @create 2019-06-05 13:15
 */

public class FreeTimeState extends State {

    private Context context;

    public FreeTimeState(Context context) {
        this.context = context;
    }

    @Override
    public void bookRoom() {
        System.out.println("您已经成功预订了...");
        context.setState(context.getBookedState());
    }

    @Override
    public void checkInRoom() {
        System.out.println("您已经成功入住了...");
        context.setState(context.getCheckInState());

    }

    @Override
    public void unsubscribeRoom() {
        //不需要做操作
    }


    @Override
    public void checkOutRoom() {
        //不需要做操作
    }
}
