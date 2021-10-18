package xyz.rgnt.mth.tuples;

import lombok.Getter;
import lombok.Setter;

/**
 * Tuple pair
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class Pair<X, Y> {

    @Getter
    @Setter
    private X first;
    @Getter
    @Setter
    private Y second;

    /**
     * Constructs Pair
     *
     * @param first  First value
     * @param second Second value
     */
    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Constructs Pair. See {@link Pair}
     * @param first  First value
     * @param second Second value
     *
     * @param <X> Type of first value
     * @param <Y> Type of second value
     * @return Pair
     */
    public static <X, Y> Pair<X, Y> of(X first, Y second) {
        return new Pair<>(first, second);
    }
}
