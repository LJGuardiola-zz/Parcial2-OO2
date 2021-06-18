package ar.edu.unrn.liskov_substitution.c;

public class RubberDuck implements Duck {

    @Override
    public void swim() {
        System.out.println("Rubber duck está nadando.");
    }

    @Override
    public void cuack() {
        System.out.println("Rubber duck hizo cuack.");
    }

}
