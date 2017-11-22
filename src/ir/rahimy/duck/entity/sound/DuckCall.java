package ir.rahimy.duck.entity.sound;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("I am Duck Calling ... ");
    }
}
