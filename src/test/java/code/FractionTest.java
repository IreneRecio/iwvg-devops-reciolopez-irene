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

    @Test
    void testIsProperTrue() {
        Fraction fraction = new Fraction(3, 5);
        assertThat(fraction.isProper()).isTrue();
    }

    @Test
    void testIsProperFalse() {
        Fraction fraction = new Fraction(7, 4);
        assertThat(fraction.isProper()).isFalse();
    }

    @Test
    void testIsImproperTrue() {
        Fraction fraction = new Fraction(7, 4);
        assertThat(fraction.isImproper()).isTrue();
    }

    @Test
    void testIsImproperFalse() {
        Fraction fraction = new Fraction(3, 5);
        assertThat(fraction.isImproper()).isFalse();
    }

    @Test
    void testAddFractions() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.add(f2);

        assertThat(result.getNumerator()).isEqualTo(5);
        assertThat(result.getDenominator()).isEqualTo(6);
    }

    @Test
    void testMultiplyFractions() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = f1.multiply(f2);

        assertThat(result.getNumerator()).isEqualTo(6);
        assertThat(result.getDenominator()).isEqualTo(12);
    }

    @Test
    void testDivideFractions() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(4, 5);
        Fraction result = f1.divide(f2);

        assertThat(result.getNumerator()).isEqualTo(10);
        assertThat(result.getDenominator()).isEqualTo(12);
    }

}
