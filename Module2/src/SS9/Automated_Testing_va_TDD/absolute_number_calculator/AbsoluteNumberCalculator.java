package SS9.Automated_Testing_va_TDD.absolute_number_calculator;


public class AbsoluteNumberCalculator {

    public static int findAbsolute(int number){
        if (number < 0){
            return -number;
        }
        return number;
    }

}
