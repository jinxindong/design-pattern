package struct.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式+工厂模式
 *
 * @author Karl Jin
 * @create 2019-05-31 13:44
 */

public class TeacherFactory {
    private static ConcurrentHashMap<String, Teacher> hashMap = new ConcurrentHashMap();

    public static Teacher getTeacher(String name) {
        if (hashMap.get(name) == null) {
            Teacher teacher = new Teacher(name);
            hashMap.put(name, teacher);
        }
        return hashMap.get(name);
    }

}
