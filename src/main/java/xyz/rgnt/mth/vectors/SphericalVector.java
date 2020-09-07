package xyz.rgnt.mth.vectors;

/**
 * Spherical vector
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class SphericalVector extends PolarVector {

    private double incline;

    /**
     * Default constructor
     * @param radius  Radius
     * @param azimuth Azimuth in degrees
     * @param incline Incline in degrees
     */
    public SphericalVector(double radius, double azimuth, double incline) {
        super(radius, azimuth);
        this.incline = incline;
    }

    /**
     * @return Incline in degrees
     */
    public double getIncline() {
        return incline;
    }
}
