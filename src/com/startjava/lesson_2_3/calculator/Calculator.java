package com.startjava.lesson_2.calculator;

public class Calculator {
    private String mathSign;
    private int num1;
    private int num2;
    private float result;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public float getResult() {
        return result;
    }

    public void calculate() {
        switch (mathSign) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                result = (float) num1 / num2;
                break;
            case "^" :
                result = pow();
                break;
            case "%" :
                result = num1 % num2;
                break;
            default :
                result = 0;
        }
    }

    private float pow() {
        result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        return result;
    }
}