package xyz.rgnt.mth.tuples.complex;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Tuple complex triple
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class ComplexTriple<X, Y, Z> {

    @Getter
    @Setter
    private List<X> first
            = new ArrayList<>();

    @Getter
    @Setter
    private List<Y> second
            = new ArrayList<>();

    @Getter
    @Setter
    private List<Z> third
            = new ArrayList<>();

    /**
     * Construct ComplexTriple from lists of types
     * @param first  First array of types.
     * @param second Second array of types.
     * @param third  Third array of types.
     */
    public ComplexTriple(@NotNull List<X> first,
                         @NotNull List<Y> second,
                         @NotNull List<Z> third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Constructs ComplexTriple from lists of types. See {@link ComplexTriple}.
     *
     * @param first  First
     * @param second Second
     * @param third  Third
     *
     * @param <X> Type of X
     * @param <Y> Type of Y
     * @param <Z> Type of Z
     * @return Complex Triple
     */
    public static <X, Y, Z> ComplexTriple<X, Y, Z> of(List<X> first, List<Y> second, List<Z> third) {
        return new ComplexTriple<X, Y, Z>(first, second, third);
    }

    /**
     * Construct ComplexTriple from complex singles.
     *
     * @param first  First Complex Single
     * @param second Second Complex Single
     * @param third  Third Complex Single
     *
     * @param <X> Type of X
     * @param <Y> Type of Y
     * @param <Z> Type of Z
     * @return Complex Triple
     */
    public static <X, Y, Z> ComplexTriple<X, Y, Z> of(ComplexSingle<X> first, ComplexSingle<Y> second, ComplexSingle<Z> third) {
        return new ComplexTriple<X, Y, Z>(first.getValue(), second.getValue(), third.getValue());
    }
}
