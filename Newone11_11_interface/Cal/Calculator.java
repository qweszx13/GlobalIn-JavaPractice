package Newone11_11_interface.Cal;

public class Calculator implements ICalculator {

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multi(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int div(int num1, int num2) {
        return num1/num2;
    }
}
