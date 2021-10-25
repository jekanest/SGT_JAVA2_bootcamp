package lesson6.OOP;

abstract public class Shape {
    abstract public int calculatePerimeter();
}

class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculatePerimeter() {
        return (height + width) * 2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class Square extends Shape {

    private int side;

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }
}
