package ir.rahimy.duck.entity.flight;

public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("i am flying with wings ...");
    }
}
