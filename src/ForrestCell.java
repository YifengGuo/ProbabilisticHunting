/**
 * Created by guoyifeng on 11/7/17.
 */
public class ForrestCell extends Cell {
    private boolean hasTarget;
    private double belief;
    public boolean failed;

    @Override
    public void setBelief(double belief) {
        this.belief = belief;
    }

    @Override
    public double getBelief() {
        return this.belief;
    }

    @Override
    public void setHasTarget() {
        this.hasTarget = true;
    }
    @Override
    public Terrain getTerrain() {
        return Terrain.FOREST;
    }

    @Override
    public boolean hasTarget() {
        return this.hasTarget;
    }

    @Override
    public String toString() {
        return "T";
    }

    // constructor
    public ForrestCell(double initialBeleif) {
        this.belief = initialBeleif;
        hasTarget = false;
        this.failed = false;
    }
}
