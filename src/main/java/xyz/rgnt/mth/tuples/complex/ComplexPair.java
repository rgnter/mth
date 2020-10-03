package xyz.rgnt.mth.tuples.complex;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Tuple complex pair
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class ComplexPair<X, Y> {

    @Getter
    @Setter
    private List<X> first = new ArrayList<>();

    @Getter
    @Setter
    private List<Y> second = new ArrayList<>();

    public ComplexPair(@NotNull List<X> first, @NotNull List<Y> second) {
        this.first = first;
        this.second = second;
    }

    public static <X, Y> ComplexPair<X, Y> of(List<X> first, List<Y> second) {
        return new ComplexPair<X, Y>(first, second);
    }

    public static <X, Y> ComplexPair<X, Y> of(ComplexSingle<X> first, ComplexSingle<Y> second) {
        return new ComplexPair<X, Y>(first.getValue(), second.getValue());
    }
}
