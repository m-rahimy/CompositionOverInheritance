package ir.rahimy.duck.entity.sound;

public class GooseHonk implements Honkable {
    @Override
    public void honk() {
        System.out.println("I am goose honking");
    }
}
