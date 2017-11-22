package ir.rahimy.duck.entity.adapter;

import ir.rahimy.duck.entity.duck.DuckLike;
import ir.rahimy.duck.entity.turkey.TurkeyLike;

public class DuckAdapter implements TurkeyLike {

    private final DuckLike duckLike;

    public DuckAdapter(final DuckLike duckLike) {

        this.duckLike = duckLike;
    }

    @Override
    public void gobble() {
        duckLike.quack();
    }

    @Override
    public void fly() {
        duckLike.fly();
    }

    @Override
    public void swim() {
        duckLike.swim();
    }
}
