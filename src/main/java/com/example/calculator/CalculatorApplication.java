package com.example.calculator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public void plus(int a, int b) {
        System.out.println(a+b);
    }

    public void minus(int a, int b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        CalculatorApplication calculator = new CalculatorApplication();
        calculator.plus(5, 5);
        calculator.minus(5,5);
    }


}
