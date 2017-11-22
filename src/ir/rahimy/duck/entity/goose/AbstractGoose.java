package ir.rahimy.duck.entity.goose;

import ir.rahimy.duck.entity.flight.Flyable;
import ir.rahimy.duck.entity.sound.Honkable;
import ir.rahimy.duck.entity.sound.Quackable;

public abstract class AbstractGoose implements GooseLike {

    //protected static String TAG = getClass().getSimpleName();

    protected Flyable flyBehaviour;
    protected Honkable honkableBehaviour;

    public AbstractGoose(Flyable flyBehaviour, Honkable honkable) {
        this.flyBehaviour = flyBehaviour;
        this.honkableBehaviour = honkable;
    }

    public abstract void display();
    public abstract void swim();

    public void setFlyBehaviour(Flyable flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setHonkableBehaviour(Honkable honkableBehaviour) {
        this.honkableBehaviour = honkableBehaviour;
    }

    @Override
    public void fly() {
        flyBehaviour.fly();
    }

    @Override
    public void honk() {
        honkableBehaviour.honk();
    }
}
