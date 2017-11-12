/**
 * Created by guoyifeng on 11/7/17.
 */
public abstract class Cell {
    private boolean hasTarget;
    /**
     * belief state: the probability given everything has been observed
     *               so far that the target is in a given cell
     *     Belief = P(Target in Cell_i | Observations through time t)
     */
    private double belief;

    public boolean failed;

    public abstract String toString();
    public abstract double getBelief();

    public abstract void setBelief(double belief);

    public abstract void setHasTarget();
    public abstract Terrain getTerrain();

    public abstract boolean hasTarget();
}
