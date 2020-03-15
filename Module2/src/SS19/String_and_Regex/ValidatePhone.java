package SS19.String_and_Regex;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test;
        String regexp= "^[(][0-9][1-9][)][-][(][0][0-9]{9}[)]$";
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
