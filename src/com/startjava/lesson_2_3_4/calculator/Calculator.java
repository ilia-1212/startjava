package com.startjava.lesson_2_3_4.calculator;

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

    public float calculate() {
        calculateExpression();
        return result;
    }

    public void calculateExpression() {
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
                result = (float) Math.pow(num1, num2);
                break;
            case "%" :
                result = num1 % num2;
                break;
            default :
                result = 0;
        }
    }
}