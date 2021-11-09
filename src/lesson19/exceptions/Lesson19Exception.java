package lesson19.exceptions;

public class Lesson19Exception {

    public double multipleByTwo( double someNumber) {
        this.divideByNumber(7, 0);
        return someNumber * 2;
    }

    public double divideByNumber (int dividable, int divider) {
        //try catch block!!! will solve Error
        try {
            return dividable / divider;
        } catch (ArithmeticException e) {
            System.out.println("There is Arithmetic Exception. Exception text is: " + (e.getMessage()));
            return 0;
        }
    }


    //Throws keyword
    void method1() {
        try {
            System.out.println("Something");
        } catch (Exception e) {
            throw e;
        }
    }

    //would be = to:
    int method2() throws Exception {
        System.out.println("Something");
        return 0;
    }

}