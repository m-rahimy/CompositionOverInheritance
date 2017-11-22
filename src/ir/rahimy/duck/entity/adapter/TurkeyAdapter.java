package ir.rahimy.duck.entity.adapter;

import ir.rahimy.duck.entity.duck.DuckLike;
import ir.rahimy.duck.entity.turkey.TurkeyLike;

public class TurkeyAdapter implements DuckLike {

    private TurkeyLike turkeyLike;

    public TurkeyAdapter(final TurkeyLike turkeyLike) {
        this.turkeyLike = turkeyLike;

    }

    @Override
    public void fly() {
        turkeyLike.fly();
    }

    @Override
    public void quack() {
        turkeyLike.gobble();
    }

    @Override
    public void swim() {
        turkeyLike.swim();
    }
}
