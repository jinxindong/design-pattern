package struct.flyweight;

/**
 * @author Karl Jin
 * @create 2019-05-31 13:41
 */

public class Teacher implements Person {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void doSomehing() {
        System.out.println("老师：" + name);
    }
}
