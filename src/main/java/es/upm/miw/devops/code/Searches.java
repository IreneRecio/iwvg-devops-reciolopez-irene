package es.upm.miw.devops.code;

import java.util.stream.Stream;

public class Searches {
    //Method c
    public Stream<Double> findDecimalFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getName().equals(name))
                .flatMap(user -> user.getFractions().stream())
                .map(f -> (double) f.getNumerator() / f.getDenominator());
    }

    //Method 0
    public Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isProper))
                .map(user -> user.getFamilyName().substring(0,1) + ".");
    }

}
