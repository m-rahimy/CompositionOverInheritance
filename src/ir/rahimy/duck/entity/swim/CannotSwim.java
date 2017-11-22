package ir.rahimy.duck.entity.swim;

public class CannotSwim implements Swimable {
    @Override
    public void swim() {
        System.out.println("I can not swim ... ");
    }
}
