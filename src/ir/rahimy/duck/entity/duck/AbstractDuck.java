package ir.rahimy.duck.entity.duck;

import ir.rahimy.duck.entity.flight.Flyable;
import ir.rahimy.duck.entity.sound.Quackable;
import ir.rahimy.duck.entity.swim.Swimable;

public abstract class AbstractDuck implements DuckLike {

    protected Flyable flyBehaviour;
    protected Quackable quackBehaviour;
    protected Swimable swimBehaviour;

    public AbstractDuck(Flyable flyBehaviour, Quackable quackBehaviour, Swimable swimBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.swimBehaviour = swimBehaviour;
    }

    public abstract void display();

    public void setFlyBehaviour(Flyable flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(Quackable quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    @Override
    public void fly() {
        flyBehaviour.fly();
    }

    @Override
    public void quack() {
        quackBehaviour.quack();
    }

    @Override
    public void swim() {
        swimBehaviour.swim();
    }

}
