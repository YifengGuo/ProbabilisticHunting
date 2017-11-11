import java.util.Random;

/**
 * Created by guoyifeng on 11/7/17.
 */
public class CellsMap {
    public Cell[][] map;
    private Random rand;
    private Target target;

    /**
     * constructor of map </br>
     * initialize 50 * 50 cells with random terrain
     * based on its initial occurrence probability
     */
    public CellsMap() {
        map = new Cell[50][50];
        rand = new Random();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                double randomNum = rand.nextDouble();
                if (randomNum <= Terrain.FLAT.getInitialOcurProb()) {
                    map[i][j] = new FlatCell(1 / map.length * map[0].length);
                } else if (randomNum > Terrain.FLAT.getInitialOcurProb()
                          && randomNum <= Terrain.HILLY.getInitialOcurProb()) {
                    map[i][j] = new HillyCell(1 / map.length * map[0].length);
                } else if (randomNum > Terrain.HILLY.getInitialOcurProb()
                        && randomNum <= Terrain.FOREST.getInitialOcurProb()) {
                    map[i][j] = new ForrestCell(1 / map.length * map[0].length);
                } else {
                    map[i][j] = new MazeCell(1 / map.length * map[0].length);
                }
            }
        }
        target = new Target(rand.nextInt(map.length), rand.nextInt(map[0].length));
        map[target.getX()][target.getY()].setHasTarget();
    }

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j].toString() + " ");
            }
            System.out.println();
        }
    }

    public void printTarget() {
        System.out.println("The target is located at : (" + target.getX() + ", " + target.getY() +")");
    }
}
