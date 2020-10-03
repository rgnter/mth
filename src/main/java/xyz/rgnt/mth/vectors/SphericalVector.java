package xyz.rgnt.mth.vectors;

import lombok.Getter;

/**
 * Spherical vector
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class SphericalVector extends PolarVector {

    @Getter
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


}
