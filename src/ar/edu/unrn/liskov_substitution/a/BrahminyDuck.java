package ar.edu.unrn.liskov_substitution.a;

public class BrahminyDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("Brahminy duck está volando.");
    }

    @Override
    public void swim() {
        System.out.println("Brahminy duck está nadando.");
    }

    @Override
    public void cuack() {
        System.out.println("Brahminy duck hizo cuack.");
    }

}
