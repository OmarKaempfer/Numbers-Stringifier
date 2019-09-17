package es.ulpgc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersStringifier_ {
    @Test
    public void given_0_should_return_zero() {
        assertThat(NumberStringifier.stringify(0)).isEqualTo("zero");
    }

    @Test
    public void given_1_should_return_one() {
        assertThat(NumberStringifier.stringify(1)).isEqualTo("one");
    }
}
