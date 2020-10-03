package xyz.rgnt.mth.vectors;

import lombok.Getter;

/**
 * Polar vector
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class PolarVector {

    @Getter
    private double radius;
    @Getter
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
     * @return Diameter
     */
    public double getDiameter() {
        return getRadius() * 2;
    }



}
