package create.builder;

/**
 * @author Karl Jin
 * @create 2019-05-28 13:17
 */

public class GongyuHouseBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("设置公寓的地板");
    }

    @Override
    public void makeWall() {
        house.setWall("设置公寓的墙");

    }

    @Override
    public void makeHouseTop() {
        house.setHousetop("设置公寓的房顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
