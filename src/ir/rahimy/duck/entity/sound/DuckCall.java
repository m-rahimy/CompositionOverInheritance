package ir.rahimy.duck.entity.sound;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("i am Duck Calling ... ");
    }
}
