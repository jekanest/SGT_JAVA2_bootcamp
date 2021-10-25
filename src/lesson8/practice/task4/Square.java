package lesson8.practice.task4;

public class Square extends Rectangle{

    private int s;

    public Square (int s) {
        super(s,s);
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

}

