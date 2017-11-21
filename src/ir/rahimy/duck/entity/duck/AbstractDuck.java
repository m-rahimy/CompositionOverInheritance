package ir.rahimy.duck.entity.duck;

import ir.rahimy.duck.entity.flight.Flyable;
import ir.rahimy.duck.entity.sound.Quackable;

public abstract class AbstractDuck implements DuckLike {

    //protected static String TAG = getClass().getSimpleName();

    protected Flyable flyBehaviour;
    protected Quackable quackBehaviour;

    public AbstractDuck(Flyable flyBehaviour, Quackable quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();
    public abstract void swim();

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
    public String toString() {
        return "AbstractDuck{" +
                "flyBehaviour=" + flyBehaviour +
                ", quackBehaviour=" + quackBehaviour +
                '}';
    }
}
