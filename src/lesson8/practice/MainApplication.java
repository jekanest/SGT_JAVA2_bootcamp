package lesson8.practice;

import lesson8.practice.task1.ChildClass;
import lesson8.practice.task1.ParentClass;
import lesson8.practice.task3.Employee;
import lesson8.practice.task3.Manager;
import lesson8.practice.task4.Rectangle;
import lesson8.practice.task4.Square;
import lesson8.practice.task6.*;

public class MainApplication {

    public static void main(String[] args) {

        // Task 1 and 2
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();

        parentClass.parentWhatClassIsThis();//method of parent class by object of parent class
        childClass.childWhatClassIsThis();//method of child class by object of child class
        childClass.parentWhatClassIsThis();// method of parent class by object of child class

        System.out.println("***********************************************");

        //Task 3
        Employee employee = new Employee("Agris Melnis", 35, 26182459, "12, Valdemāara street, Riga", 2000.00, "HR specialist");

        Manager manager = new Manager("Anna Markova", 32, 29351248, "64,G.Zemgale", 3020.51, "Finance department");

        employee.printSalary();
        manager.printSalary();
        System.out.println("***********************************************");

        //task 4

        Rectangle rectangle = new Rectangle(15, 28);
        rectangle.printArea();
        rectangle.printPerimeter();
        System.out.println("");

        Square square = new Square(14);
        square.printArea();
        square.printPerimeter();
        System.out.println("");

        Square[ ] squareObjects = new Square[10];
        squareObjects[0] = new Square(1);
        squareObjects[1] = new Square(2);
        squareObjects[2] = new Square(3);
        squareObjects[3] = new Square(4);
        squareObjects[4] = new Square(5);
        squareObjects[5] = new Square(6);
        squareObjects[6] = new Square(7);
        squareObjects[7] = new Square(8);
        squareObjects[8] = new Square(9);
        squareObjects[9] = new Square(10);

        for (int i = 0; i < squareObjects.length; i++) {
            squareObjects[i].printArea();
        }

        System.out.println("***********************************************");
        //task 6
        lesson8.practice.task6.Square.printShape();
        lesson8.practice.task6.Square.printRectangle();
        lesson8.practice.task6.Square.printSquare();

    }
}


