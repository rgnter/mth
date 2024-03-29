package xyz.rgnt.mth;


import xyz.rgnt.mth.tuples.Pair;
import xyz.rgnt.mth.vectors.PolarVector;
import xyz.rgnt.mth.vectors.SphericalVector;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;

/**
 * Math utility class
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a> and wattmann
 *
 * Uses XZY coordinates. Y up.
 */
public class Mth {

    /**
     * Converts polar coordinates to cartesian coordinates.
     *
     * @param magnitude Magnitude
     * @param azimuth   Azimuth angle in degrees
     *
     * @return Vector with populated X and Y
     */
    public static @NotNull Vector polarToCartesian(double magnitude, double azimuth) {
        return new Vector((magnitude * Math.cos(Math.toRadians(azimuth))), (magnitude * Math.sin(Math.toRadians(azimuth))), 0);
    }

    /**
     * Converts spherical coordinates to cartesian coordinates.
     *
     * @param magnitude   Magnitude
     * @param azimuth     Azimuth angle in degrees
     * @param incline     Incline angle in degrees
     *
     * @return Vector with populated X, Y and Z
     */
    public static @NotNull Vector sphericalToCartesian(double magnitude, double azimuth, double incline) {
        return new Vector(
                (magnitude * (Math.sin(Math.toRadians(incline)) * Math.cos(Math.toRadians(azimuth)))),
                magnitude * Math.cos(Math.toRadians(incline)),
                (magnitude * (Math.sin(Math.toRadians(incline)) * Math.sin(Math.toRadians(azimuth)))));
    }

    /**
     * Converts cartesian coordinates to spherical coordinates.
     *
     * @param position Vector position
     *
     * @return Spherical vector
     * */
    public static @NotNull
    SphericalVector cartesianToSpherical(@NotNull Vector position) {
        double radius = Math.sqrt(Math.pow(position.getX(), 2) + Math.pow(position.getY(), 2) + Math.pow(position.getZ(), 2));
        double azimuth = Math.toDegrees(Math.atan(position.getZ() / position.getX()));
        double inclination = Math.toDegrees(Math.acos(position.getY() / radius));

        return new SphericalVector(radius, azimuth, inclination);
    }

    /**
     * Converts cartesian coordinates to polar coordinates.
     *
     * @param position Vector position
     *
     * @return Polar vector
     */
    public static @NotNull PolarVector cartesianToPolar(@NotNull Vector position) {
        double radius  = Math.sqrt(Math.pow(position.getX(), 2) + Math.pow(position.getZ(), 2));
        double azimuth = Math.atan2(position.getX(), position.getZ());

        return new PolarVector(radius, azimuth);
    }

    /**
     * Sorts Vectors by coordinates
     * @param vec0 Vector
     * @param vec1 Vector
     * @return Pair of Vectors. <br>
     *         First vector has the most great values. <br>
     *         Second vector has the least great values <br>
     */
    public static @NotNull Pair<Vector, Vector> sortMostToLeast(@NotNull Vector vec0, @NotNull Vector vec1) {
        Vector most = new Vector();
        Vector least = new Vector();

        if(vec0.getX() > vec1.getX()) {
            most.setX(vec0.getX());
            least.setX(vec1.getX());
        }
        else {
            most.setX(vec1.getX());
            least.setX(vec0.getX());
        }

        if(vec0.getY() > vec1.getY()) {
            most.setY(vec0.getY());
            least.setY(vec1.getY());
        }
        else {
            most.setY(vec1.getY());
            least.setY(vec0.getY());
        }

        if(vec0.getZ() > vec1.getZ()) {
            most.setZ(vec0.getZ());
            least.setZ(vec1.getZ());
        }
        else {
            most.setZ(vec1.getZ());
            least.setZ(vec0.getZ());
        }

        return Pair.of(most, least);
    }


    /**
     * Converts yaw angle to degree angle
     *
     * @param yaw Yaw
     * @return Degree
     */
    public static double yawToDeg(double yaw) {
        double deg = yaw + 90;
        if (deg >= 360)
            deg -= 360;
        return deg;
    }

    /**
     * Converts degree angle to yaw angle
     *
     * @param deg Degree
     * @return Pitch
     */
    public static double degToYaw(double deg) {
        return deg - 90;
    }

    /**
     * Converts pitch angle to degree angle
     *
     * @param pitch Pitch
     * @return Degree
     */
    public static double pitchToDeg(double pitch) {
        return pitch + 90;
    }

    /**
     * Converts degree angle to pitch angle
     *
     * @param deg Degree
     * @return Pitch
     */
    public static double degToPitch(double deg) {
        return deg - 90;
    }

    /**
     * Rounds number with respect to decimal places.
     *
     * @param num           Number to round
     * @param decimalPlaces Decimal places to respect.
     *
     * @return Rounded number
     */
    public static double round(double num, int decimalPlaces) {
        double rounded = Math.round(num * (decimalPlaces * 10));
        return rounded / (decimalPlaces * 10);
    }


    /**
     * Converts ARGB color to big-endian int.
     * <br>
     * Alpha value will encoded on the most significant bit place. Blue value will encoded on the least significant bit place.
     * <br>
     * If value of any color exceeds 255 or precedes 0, value will be trimmed to maximum/minimum valid value
     * @param alpha Alpha value
     * @param red   Red value
     * @param green Green value
     * @param blue  Blue value
     * @return Encoded RGB
     */
    public static int rgbaToInt(int alpha, int red, int green, int blue) {
        if(alpha > 255)
            alpha = 255;
        if(alpha < 0)
            alpha = 0;
        if(red > 255)
            red = 255;
        if(red < 0)
            red = 0;
        if(green > 255)
            green = 255;
        if(green < 0)
            green = 0;
        if(blue > 255)
            blue = 255;
        if(blue < 0)
            blue = 0;


        int result = 0b00000000_00000000_00000000_00000000;
        result = result | alpha << 24;
        result = result | red   << 16;
        result = result | green << 8;
        result = result | blue;
        return result;
    }

    /**
     * Converts RGB color to big-endian int.
     * <br>
     * Red value will encoded on the most significant bit place (3rd byte). Blue value will encoded on the least significant bit place.
     * <br>
     * If value of any color exceeds 255 or precedes 0, value will be trimmed to maximum/minimum valid value.
     * @param red   Red value
     * @param green Green value
     * @param blue  Blue value
     * @return Encoded RGB
     */
    public static int rgbToInt(int red, int green, int blue) {
        return rgbaToInt(0, red, green, blue);
    }
}
