package behavior.state;

/**
 * 状态模式
 * http://blog.didispace.com/spring-statemachine/ 状态机case
 * <p>
 * 解释：改变对象的内部状态而改变对象的行为，这个对象表现的就好像修改了他的类一样
 * 1、状态拥有者的实体模型
 * 2、状态接口，定义业务方法
 * 3、状态的各个具体实现类，分别实现业务方法
 * <p>
 * <p>
 * 1、context持有了当前状态，并将有行为事件，且行为事件委托给当前状态执行
 * 2、具体行为事件持有context，因为方法在执行之后，需要对context设置状态
 * 3、main客户端乘触发事件，事件发生后当前状态会发生改变。
 *
 * <p>
 * 优点：
 * 1、将与特定状态相关的行为局部化,并且将不同状态的行为分割开来。
 * 2、特定状态的相关的行为都放入一个对象中，由于所有的与状态相关的代码都存在于某个ConcreteState中，所以通过定义新的子类，可以很容易的增加新的状态和转换。
 * 3、消除了庞大的条件分支语句，通过各种状态把逻辑分布到state的子类之中，来减少相互之间的依赖
 * <p>
 * 缺点：
 * 1、会增加系统中类和对象的个数。使用不当会导致系统的复杂性增加
 *
 * @author Karl Jin
 * @create 2019-06-05 09:47
 */

public class Main {

    public static void main(String[] args) {
        //有2间房
        Context[] rooms = new Context[2];
        //初始化
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Context();
        }
        //第一间房
        rooms[0].bookRoom();    //预订
        rooms[0].checkInRoom();   //入住
        rooms[0].bookRoom();    //预订
        System.out.println(rooms[0]);
        System.out.println("---------------------------");

        //第二间房
        rooms[1].checkInRoom();
        rooms[1].bookRoom();
        rooms[1].checkOutRoom();
        rooms[1].bookRoom();
        System.out.println(rooms[1]);

    }
}
