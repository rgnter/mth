package xyz.rgnt.mth.tuples.complex;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tuple complex single
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class ComplexSingle<X> {

    @Getter
    @Setter
    private List<X> value = new ArrayList<>();

    public ComplexSingle(@NotNull List<X> value) {
        this.value = value;
    }

    public static <X> ComplexSingle<X> of(List<X> value) {
        return new ComplexSingle<X>(value);
    }

    public static <X> ComplexSingle<X> of(X... values) {
        return new ComplexSingle<X>(Arrays.asList(values));
    }

}
