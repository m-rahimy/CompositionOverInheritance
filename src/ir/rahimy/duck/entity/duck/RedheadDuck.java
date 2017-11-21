package ir.rahimy.duck.entity.duck;

import ir.rahimy.duck.entity.duck.AbstractDuck;
import ir.rahimy.duck.entity.flight.Flyable;
import ir.rahimy.duck.entity.sound.Quackable;

public class RedheadDuck extends AbstractDuck {

    public RedheadDuck(Flyable flyBehaviour, Quackable quackBehaviour) {
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

    }

    @Override
    public void swim() {

    }
}
