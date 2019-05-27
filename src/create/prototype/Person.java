package create.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Karl Jin
 * @create 2019-05-26 21:15
 */
public class Person implements Cloneable {
    private String name;
    private int age;
    private List<String> friends;

    @Override
    public Person clone() throws CloneNotSupportedException {
        try {
            Person person = (Person) super.clone();

            // 以下代码实现深度克隆
            List<String> newFriends = new ArrayList<>();
            for (String friend : this.getFriends()) {
                newFriends.add(friend);
            }
            person.setFriends(newFriends);

            return person;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
