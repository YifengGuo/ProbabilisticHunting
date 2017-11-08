import java.util.Random;

/**
 * Created by guoyifeng on 11/7/17.
 */
public class CellsMap {
    private Cell[][] map;
    private Random rand;
    private Target target;

    /**
     * constructor of map </br>
     * initialize 50 * 50 cells with random terrain
     * based on its initial occurrence probability
     */
    public CellsMap() {
        map = new Cell[50][50];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                double randomNum = rand.nextDouble();
                if (randomNum <= Terrain.FLAT.getInitialOcurProb()) {
                    map[i][j] = new FlatCell();
                } else if (randomNum > Terrain.FLAT.getInitialOcurProb()
                          && randomNum <= Terrain.HILLY.getInitialOcurProb()) {
                    map[i][j] = new HillyCell();
                } else if (randomNum > Terrain.HILLY.getInitialOcurProb()
                        && randomNum <= Terrain.FOREST.getInitialOcurProb()) {
                    map[i][j] = new ForrestCell();
                } else {
                    map[i][j] = new MazeCell();
                }
            }
        }
        target.setX(rand.nextInt(map.length));
        target.setY(rand.nextInt(map[0].length));
        map[target.getX()][target.getY()].setHasTarget();
    }
}
