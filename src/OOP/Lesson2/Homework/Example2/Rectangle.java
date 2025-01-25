package OOP.Lesson2.Homework.Example2;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public double area(int length , int width){
        return length * width;
    }

    public double area(int sideLength){
        return sideLength * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
