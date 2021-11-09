package lv.jekaterina.testpojects.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class TestController {

    private final double PI=3.14;

    @GetMapping(value = "/test")
    public String getTest() {
        return "This is TEST!";
    }

    @PostMapping(value = "/test")
    public String getAnotherTest() {
        System.out.println("Something is created!");
        return "This is a response for POST request!";
    }

    /**
     * calculates perimeter of a circle
     * @param radius
     * @return
     */
    @GetMapping (value = "/calculate")
    public double calculate(double radius) {
        return 2*PI*radius;
    }
}