package ir.rahimy.duck.entity.flight;

public class CannotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("i cannot fly :( ... ");
    }
}
