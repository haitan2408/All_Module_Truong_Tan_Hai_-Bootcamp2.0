package SS19.String_and_Regex;

import java.util.Scanner;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test;
        String regexp = "^[CAP][/.,*&%!@$()||]{0}[0-9]{4}[GHIKLM]$";
        while (true) {
            test = scanner.nextLine();
            if(test.matches(regexp)){
                System.out.println("Valid");
            } else {
                System.out.println("not valid");
            }
        }

    }
}
