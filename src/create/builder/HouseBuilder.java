package create.builder;

/**
 * 针对房子的一些操作
 *
 * @author Karl Jin
 * @create 2019-05-28 09:56
 */

public interface HouseBuilder {
    // 建造门
    public void makeFloor();

    // 建造墙
    public void makeWall();

    // 建造屋顶
    public void makeHouseTop();

    // 获取建造好的房子
    public House getHouse();


}
