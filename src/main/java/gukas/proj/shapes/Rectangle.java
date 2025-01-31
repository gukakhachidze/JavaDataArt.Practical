package gukas.proj.shapes;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
