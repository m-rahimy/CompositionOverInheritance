package ir.rahimy.duck.entity.flight;

public class FlyRocketPowered implements Flyable {
    @Override
    public void fly() {
        System.out.println("i am flying with mechanical aid");
    }
}
