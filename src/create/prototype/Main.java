package create.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式
 * <p>
 * 解释：复制这个原型对象的办法创建出更多同类型的对象，浅拷贝，是对象copy引用
 *
 * 下面是实现了一个深拷贝的例子
 *
 * @author Karl Jin
 * @create 2019-05-26 21:15
 */

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        List<String> friends = new ArrayList<String>();
        friends.add("James");
        friends.add("Yao");
        person1.setFriends(friends);

        Person person2 = null;
        try {
            person2 = person1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("----:" + person1.getFriends());
        System.out.println("----:" + person2.getFriends());

        friends.add("Mike");
        person1.setFriends(friends);
        System.out.println(person1.getFriends());
        System.out.println(person2.getFriends());

    }
}
