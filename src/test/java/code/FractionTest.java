package code;

import es.upm.miw.devops.code.Fraction;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionTest {
    @Test
    void testConstructorWithArguments() {
        Fraction fraction = new Fraction(3, 5);

        assertThat(fraction.getNumerator()).isEqualTo(3);
        assertThat(fraction.getDenominator()).isEqualTo(5);
    }

    @Test
    void testDefaultConstructor() {
        Fraction fraction = new Fraction();

        assertThat(fraction.getNumerator()).isEqualTo(1);
        assertThat(fraction.getDenominator()).isEqualTo(1);
    }

    @Test
    void testSetters() {
        Fraction fraction = new Fraction(2, 3);

        fraction.setNumerator(7);
        fraction.setDenominator(9);

        assertThat(fraction.getNumerator()).isEqualTo(7);
        assertThat(fraction.getDenominator()).isEqualTo(9);
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(4, 7);

        String result = fraction.toString();

        assertThat(fraction.toString())
                .isEqualTo("Fraction{numerator=4, denominator=7}");
    }
}
