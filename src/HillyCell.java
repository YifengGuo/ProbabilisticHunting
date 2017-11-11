/**
 * Created by guoyifeng on 11/7/17.
 */
public class HillyCell extends Cell {
    private boolean hasTarget;
    private double belief;

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
        return Terrain.HILLY;
    }

    @Override
    public boolean hasTarget() {
        return this.hasTarget;
    }

    @Override
    public String toString() {
        return "H";
    }

    // constructor
    public HillyCell(double initialBeleif) {
        this.belief = initialBeleif;
        hasTarget = false;
    }
}
