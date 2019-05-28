package create.builder;

/**
 * @author Karl Jin
 * @create 2019-05-28 09:53
 */

public class House {
    // 门
    private String floor;
    // 墙
    private String wall;
    // 屋顶
    private String housetop;


    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getHousetop() {
        return housetop;
    }

    public void setHousetop(String housetop) {
        this.housetop = housetop;
    }
}
