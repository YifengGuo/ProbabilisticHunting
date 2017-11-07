/**
 * Created by guoyifeng on 11/7/17.
 */
public enum Terrain {
    FLAT(0.1),
    HILLY(0.3),
    FOREST(0.7),
    MAZE(0.9);

    private final double falseNegativeRate;

    Terrain(double falseNegativeRate) {
        this.falseNegativeRate = falseNegativeRate;
    }

    public double getFalseNegativeRate() {
        return this.falseNegativeRate;
    }
}
