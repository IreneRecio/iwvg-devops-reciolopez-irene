package code;

import es.upm.miw.devops.code.Fraction;
import es.upm.miw.devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    private User user;
    private Fraction fraction1;
    private Fraction fraction2;

    @BeforeEach
    void setUp() {
        fraction1 = new Fraction();
        fraction2 = new Fraction();
        user = new User("1", "John", "Doe", new ArrayList<>(List.of(fraction1)));
    }

    @Test
    void testConstructorAndGetters() {
        assertThat(user.getId()).isEqualTo("1");
        assertThat(user.getName()).isEqualTo("John");
        assertThat(user.getFamilyName()).isEqualTo("Doe");
        assertThat(user.getFractions()).containsExactly(fraction1);
    }

    @Test
    void testSetters() {
        user.setName("Jane");
        user.setFamilyName("Smith");
        user.setFractions(new ArrayList<>(List.of(fraction2)));

        assertThat(user.getName()).isEqualTo("Jane");
        assertThat(user.getFamilyName()).isEqualTo("Smith");
        assertThat(user.getFractions()).containsExactly(fraction2);
    }

    @Test
    void testAddFraction() {
        user.addFraction(fraction2);
        assertThat(user.getFractions()).containsExactly(fraction1, fraction2);
    }

    @Test
    void testFullName() {
        assertThat(user.fullName()).isEqualTo("John Doe");
    }

    @Test
    void testInitials() {
        assertThat(user.initials()).isEqualTo("J.");
    }

    @Test
    void testToStringContainsFields() {
        String userString = user.toString();

        assertThat(userString)
                .contains("User{")
                .contains("id='1'")
                .contains("name='John'")
                .contains("familyName='Doe'")
                .contains("fractions=");
    }

    @Test
    void testDefaultConstructor() {
        User defaultUser = new User();
        assertThat(defaultUser.getFractions()).isEmpty();
    }
}
