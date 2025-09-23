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

}
