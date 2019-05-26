package create.factory.simpleFactory;

/**
 * @author Karl Jin
 * @create 2019-05-26 19:11
 */

public class Factory {

    /**
     * 获取水果实例
     *
     * @param type
     * @return
     */
    public static Fruit getFruit(String type){
        if (type.equalsIgnoreCase("apple")){
            return new Apple();// 这个获取实例可以从单例获取
        }else if(type.equalsIgnoreCase("banana")){
            return new Banana();
        }else{
            return null;
        }
    }

}
