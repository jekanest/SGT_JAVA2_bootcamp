package lesson8.practice.task4;

public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea(){
        System.out.println("The area of the rectangle is: " + length*breadth);
    }

    public void printPerimeter(){
        System.out.println("The perimeter of the rectangle is: " + (2*(length+breadth)));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
