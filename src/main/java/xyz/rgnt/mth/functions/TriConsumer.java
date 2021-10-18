package xyz.rgnt.mth.functions;

/**
 * Trinary function.
 *
 * @param <X> Type of X
 * @param <Y> Type of Y
 * @param <Z> Type of Z
 */
@FunctionalInterface
public interface TriConsumer<X,Y,Z> {

    /**
     * Performs operation
     * @param x X argument
     * @param y Y argument
     * @param z Z argument
     */
    void accept(X x, Y y, Z z);
}
