package ir.rahimy.duck.entity.sound;

public class CannotHonk implements Honkable {
    @Override
    public void honk() {
        System.out.println("I can not honk ...");
    }
}
