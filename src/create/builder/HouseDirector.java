package create.builder;

/**
 * @author Karl Jin
 * @create 2019-05-28 13:20
 */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void makeHouse() {
        houseBuilder.makeFloor();
        houseBuilder.makeHouseTop();
        houseBuilder.makeWall();
    }
}
