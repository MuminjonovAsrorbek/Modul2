package OOP.Lesson2.Homework.Example3;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int perimeter(int sideLength){
        return 4 * sideLength;
    }

    public int perimeter(int length, int width){
        return 2 * (length + width);
    }

    public double perimeter(double radius){
        return (2 * Math.PI * radius);
    }

}
