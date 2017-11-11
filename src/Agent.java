/**
 * Created by guoyifeng on 11/11/17.
 */
public class Agent {
    public static CellsMap cm = new CellsMap();
    public static void main(String[] args) {
        cm.printMap();
        cm.printTarget();
        Cell[][] map = cm.map;
        System.out.println();
    }
}
