package ir.rahimy.duck.entity.turkey;

import ir.rahimy.duck.entity.flight.Flyable;
import ir.rahimy.duck.entity.swim.Swimable;

public interface TurkeyLike extends Flyable, Swimable {

    void gobble();
}
