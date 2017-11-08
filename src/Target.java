/**
 * Created by guoyifeng on 11/7/17.
 */
public class Target {
    private int x; // x coordinate of target in map
    private int y; // y coordinate of target in map

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // maybe need to define some functions or fields to represent
    // target's likelihood in each cell of map
}
