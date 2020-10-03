package xyz.rgnt.mth.tuples;

import lombok.Getter;
import lombok.Setter;

/**
 * Tuple triple
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class Triple<X, Y, Z> {

    @Getter
    @Setter
    private X first;
    @Getter
    @Setter
    private Y second;
    @Getter
    @Setter
    private Z third;

    public Triple(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <X, Y, Z> Triple<X, Y, Z> of(X first, Y second, Z third) {
        return new Triple<>(first, second, third);
    }
}
