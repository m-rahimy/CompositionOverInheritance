package ir.rahimy.duck.entity.sound;

public class Squeak implements Quackable {
    @Override
    public void quack() {
        System.out.println("i am squeaking ...");
    }
}
