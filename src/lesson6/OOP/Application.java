package lesson6.OOP;

import lesson6.OOP.clockfeatures.domain.Hour;

public class Application {

    public static void main(String[] args) {

        DigitalClock digitalClock = new DigitalClock();

        String currentTime = digitalClock.showTime();

        System.out.println(currentTime);
        Hour hour = digitalClock.getTimeClock().getHour();

        Object object = new Object();
        System.out.println("Object reference: " + object.toString());

    }
}