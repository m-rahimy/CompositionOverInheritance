package ir.rahimy.duck.entity.duck;


import ir.rahimy.duck.entity.flight.Flyable;
import ir.rahimy.duck.entity.sound.Quackable;

public class DecoyDuck extends AbstractDuck {

    public DecoyDuck(Flyable flyBehaviour, Quackable quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("--------------------");
        System.out.println("i am a decoy duck!");
        fly();
        quack();
        System.out.println("--------------------");
    }

    @Override
    public void swim() {

    }
}
