/**
 * Created by guoyifeng on 11/11/17.
 */
public class Agent {
    public static CellsMap cm = new CellsMap();
    public static void main(String[] args) {
        cm.printMap();
        cm.printTarget();
        Cell[][] map = cm.map;
        // System.out.println(cm.CalProb_Failure(map[0][0]));
        int searchCount = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                searchCount++;
                cm.search(map[i][j]);
                if (cm.search(map[i][j])) {
                    System.out.println("The target is located at (" + i + ", " + j +")");
                    System.out.println(searchCount);
                    System.out.print(map[i][j].getBelief());
                    return;
                }
            }
        }
        System.out.println("fail to locate target.");
    }


}
