/**
 * Created by guoyifeng on 11/7/17.
 */
public abstract class Cell {
    private boolean hasTarget;
    private double belief;

    public abstract String toString();
    public abstract double getBelief();

    public abstract void setBelief(double belief);

    public abstract void setHasTarget();
    public abstract Terrain getTerrain();

    public abstract boolean hasTarget();
}
