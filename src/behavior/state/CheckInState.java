package behavior.state;

/**
 * @author Karl Jin
 * @create 2019-06-05 13:18
 */

public class CheckInState extends State{

    private Context context;

    public CheckInState(Context context) {
        this.context = context;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void checkInRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退房成功....");
        context.setState(context.getFreeTimeState());
    }



    @Override
    public void unsubscribeRoom() {
        // 不需要操作
    }
}
