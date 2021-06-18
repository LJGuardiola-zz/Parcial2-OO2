package ar.edu.unrn.liskov_substitution.b;

public class RubberDuck implements Duck {

    @Override
    public void fly() {
        throw new RuntimeException("Rubber duck no puede volar!");
    }

    @Override
    public void swim() {
        System.out.println("Rubber duck está nadando.");
    }

    @Override
    public void cuack() {
        System.out.println("Rubber duck hizo cuack.");
    }

}
