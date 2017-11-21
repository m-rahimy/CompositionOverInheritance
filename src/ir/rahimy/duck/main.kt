package ir.rahimy.duck

import ir.rahimy.duck.entity.duck.DecoyDuck
import ir.rahimy.duck.entity.flight.CannotFly
import ir.rahimy.duck.entity.flight.FlyRocketPowered
import ir.rahimy.duck.entity.sound.CannotQuack
import ir.rahimy.duck.entity.sound.Squeak

fun main(args:Array<String>){
    val decoyDuck_1 = DecoyDuck(CannotFly(), CannotQuack())
    decoyDuck_1.display()
    val decoyDuck_2 = DecoyDuck(FlyRocketPowered(), Squeak())
    decoyDuck_2.display()
}