package code;

import es.upm.miw.devops.code.Searches;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchesTest {
    @Test
    void testFindDecimalFractionByUserName() {
        // Ana tiene fracciones: [2/1, -1/5, 2/4, 4/3]
        assertThat(new Searches().findDecimalFractionByUserName("Ana").toList())
                .hasSize(4)
                .containsExactly(2.0, -0.2, 0.5, 1.3333333333333333);
    }

    //Method 0
    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction() {
        assertThat(new Searches().findUserFamilyNameInitialBySomeProperFraction().toList())
                .containsExactly("F.", "B.", "L.", "B.");
    }


}
