package lesson19.exceptions.Exceptions;

public class DBExceptionClass extends Exception {
    public DBExceptionClass() {
        super();
    }

    public DBExceptionClass(String message) {
        super(message);
    }
}