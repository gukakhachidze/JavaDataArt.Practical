package gukas.proj.interfaces.multiple;

public class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck is flying..");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming..");

    }
}
