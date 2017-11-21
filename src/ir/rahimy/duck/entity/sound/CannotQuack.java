package ir.rahimy.duck.entity.sound;

public class CannotQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
