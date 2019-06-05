package behavior.state;

/**
 * @author Karl Jin
 * @create 2019-06-05 13:20
 */

public class BookedState extends State {

    private Context context;

    public BookedState(Context context) {
        this.context = context;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已经给预定了...");
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功...");
        context.setState(context.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退订成功,欢迎下次光临...");
        context.setState(context.getFreeTimeState());
    }


    @Override
    public void unsubscribeRoom() {
        //不需要做操作
    }

}
