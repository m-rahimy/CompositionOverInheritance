package ir.rahimy.duck.entity.swim;

public class RegularSwim implements Swimable {
    @Override
    public void swim() {
        System.out.println("I am swimming regularly");
    }
}
