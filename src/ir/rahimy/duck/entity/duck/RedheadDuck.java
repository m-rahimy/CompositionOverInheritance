package ir.rahimy.duck.entity.duck;

import ir.rahimy.duck.entity.duck.AbstractDuck;
import ir.rahimy.duck.entity.flight.Flyable;
import ir.rahimy.duck.entity.sound.Quackable;
import ir.rahimy.duck.entity.swim.Swimable;

public class RedheadDuck extends AbstractDuck {


    public RedheadDuck(Flyable flyBehaviour, Quackable quackBehaviour, Swimable swimBehaviour) {
        super(flyBehaviour, quackBehaviour, swimBehaviour);
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("--------------------");
        System.out.println("I am a Redhead!");
        fly();
        quack();
        swim();
        System.out.println("--------------------");
    }

}
