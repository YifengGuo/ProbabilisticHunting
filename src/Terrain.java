/**
 * Created by guoyifeng on 11/7/17.
 */
public enum Terrain {
    FLAT(0.1, 0.2),
    HILLY(0.3, 0.5),
    FOREST(0.7, 0.8),
    MAZE(0.9, 1.0);

    private final double falseNegativeRate;
    private final double initialOcurProb;

    Terrain(double falseNegativeRate, double initialOcurProb) {
        this.falseNegativeRate = falseNegativeRate;
        this.initialOcurProb = initialOcurProb;
    }

    public double getFalseNegativeRate() {
        return this.falseNegativeRate;
    }

    public double getInitialOcurProb() {
        return this.initialOcurProb;
    }
}
