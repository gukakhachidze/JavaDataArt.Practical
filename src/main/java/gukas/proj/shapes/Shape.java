package gukas.proj.shapes;

public abstract class Shape {

    public abstract void draw();
    public abstract double calculateArea();

    public void printDetails(){
        System.out.println("This is a shape...!");
    }
}
