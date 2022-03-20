public class Calculator {
    private String sign;
    private int num1;
    private int num2;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    private float power(int a, int b) {
        float result;

        result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public float calculate() {
        float result = 0;

        switch (sign) {
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
                result =(float) num1 / num2;
                break;
            case "^" :
                result = power(num1, num2);
                break;
            case "%" :
                result = num1 % num2;
                break;
            default :
                result = 0;
                break;
        }
        return result;
    }
}