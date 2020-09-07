package xyz.rgnt.mth.vectors;

/**
 * Polar vector
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class PolarVector {

    private double radius;
    private double azimuth;

    /**
     * Default constructor
     * @param radius  Radius
     * @param azimuth Azimuth in degrees
     */
    public PolarVector(double radius, double azimuth) {
        this.radius = radius;
        this.azimuth = azimuth;
    }

    /**
     * @return Radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @return Diameter
     */
    public double getDiameter() {
        return getRadius() * 2;
    }

    /**
     * @return Azimuth in degrees
     */
    public double getAzimuth() {
        return azimuth;
    }


}
