package ir.rahimy.duck.entity.sound;

public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("I am quacking");
    }
}
