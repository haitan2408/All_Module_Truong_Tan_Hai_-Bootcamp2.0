package SS9.Automated_Testing_va_TDD.Demo1;

public class Calculator {
    public int add(int firstOperand, int secondOperand) {
        if (firstOperand / 2 + secondOperand / 2 >= Integer.MAX_VALUE / 2 || firstOperand / 2 + secondOperand / 2 <= Integer.MIN_VALUE / 2) {
            throw new RuntimeException("out of range exception");
        }
        return firstOperand + secondOperand;
    }
}
