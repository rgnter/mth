package xyz.rgnt.mth.tuples;

import lombok.Getter;
import lombok.Setter;

/**
 * Tuple single
 * <br>
 * Created by <a href="https://rgnter.github.io">rgnt</a>
 */
public class Single<X> {

    @Getter
    @Setter
    private X value;

    public Single(X value) {
        this.value = value;
    }

    public static <X> Single<X> of(X value) {
        return new Single<>(value);
    }
}
