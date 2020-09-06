/* package here */

import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;

/**
 * Math utility class
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a> and WattMann#7756
 */
public class Mth {

    /**
     * Converts polar coordinates to cartesian coordinates.
     *
     * @param magnitude Magnitude
     * @param azimuth   Azimuth angle in degrees
     *
     * @return Vector with populated X and Z
     */
    public static @NotNull Vector polarToCartesian(double magnitude, double azimuth) {
        return new Vector((magnitude * Math.cos(Math.toRadians(azimuth))), 0, (magnitude * Math.sin(Math.toRadians(azimuth))));
    }

    /**
     * Converts spherical coordinates to cartesian coordinates
     *
     * @param magnitude   Magnitude
     * @param azimuth     Azimuth angle in degrees
     * @param incline     Incline angle in degrees
     *
     * @return Vector with populated X, Y and Z
     */
    public static Vector sphericalToCartesian(double magnitude, double azimuth, double incline) {
        return new Vector(
                (magnitude * (Math.sin(Math.toRadians(incline)) * Math.cos(Math.toRadians(azimuth)))),
                magnitude * Math.cos(Math.toRadians(incline)),
                (magnitude * (Math.sin(Math.toRadians(incline)) * Math.sin(Math.toRadians(azimuth)))));
    }

    /**
     * Converts cartesian coordinates to spherical coordinates.
     *
     * @param source      Source position
     * @param destination Destination position
     *
     * @return Vector. X being radius, Y being yaw, and Z being pitch
     * */
    public static @NotNull Vector cartesianToSpherical(@NotNull Vector source, @NotNull Vector destination) {
        Vector local = destination.clone().subtract(source);
        double radius = Math.sqrt(Math.pow(local.getX(), 2) + Math.pow(local.getY(), 2) + Math.pow(local.getZ(), 2));
        double azimuth = Math.toDegrees(Math.atan(local.getZ() / local.getX()));
        double inclination = Math.toDegrees(Math.acos(local.getY() / radius));

        double yaw;

        if(local.getX() > local.getZ())
            yaw = azimuth - 90;
        else yaw = azimuth + 90;

        return new Vector(radius, yaw, degToPitch(inclination));
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
     * Converts <span color="red">R</span><span color="green">G</span><span color="blue">B</span> color to int.
     * <br>
     * Red value will encoded on the most significant bit place. Blue value will encoded on the least significant bit place.
     * <br>
     * If value of any color exceeds 255 or precedes 0, value will be trimmed to maximum/minimum valid value.
     * @param red   Red value
     * @param green Green value
     * @param blue  Blue value
     * @return Encoded RGB
     */
    public static int rgbToInt(int red, int green, int blue) {
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


        int result = 0b00000000_00000000_00000000;
        result = result | red   << 16;
        result = result | green << 8;
        result = result | blue;
        return result;
    }

}