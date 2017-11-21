package ir.rahimy.duck;

import ir.rahimy.duck.entity.duck.DecoyDuck;
import ir.rahimy.duck.entity.flight.CannotFly;
import ir.rahimy.duck.entity.flight.FlyRocketPowered;
import ir.rahimy.duck.entity.sound.CannotQuack;
import ir.rahimy.duck.entity.sound.Squeak;

public class MainJava {

    public static void main(String[] args){

        DecoyDuck decoyDuck_1 = new DecoyDuck(new CannotFly(), new CannotQuack());
        decoyDuck_1.display();
        DecoyDuck decoyDuck_2 = new DecoyDuck(new FlyRocketPowered(), new Squeak());
        decoyDuck_2.display();
    }
}
