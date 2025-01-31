package gukas.proj.shapes;

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    public void draw(){
        System.out.println("Drawing a square..!");
    }

}
