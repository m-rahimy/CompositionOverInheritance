package ir.rahimy.duck.entity.goose;

import ir.rahimy.duck.entity.flight.Flyable;
import ir.rahimy.duck.entity.sound.Honkable;

public class GreylagGoose extends AbstractGoose {

    public GreylagGoose(Flyable flyBehaviour, Honkable honkable) {
        super(flyBehaviour, honkable);
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("--------------------");
        System.out.println("I am a Greylag Goose !");
        fly();
        honk();
        System.out.println("--------------------");
    }

    @Override
    public void swim() {

    }
}
