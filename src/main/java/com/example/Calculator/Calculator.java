
package com.example.Calculator;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else if (number < 0) {
            return false;
        } else if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}
