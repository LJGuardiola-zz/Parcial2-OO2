package ar.edu.unrn.liskov_substitution.b;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Duck> ducks = new ArrayList<>();

        ducks.add(new BrahminyDuck());
        ducks.add(new RubberDuck());

        for (Duck duck : ducks) {
            duck.fly();
        }

    }
}
