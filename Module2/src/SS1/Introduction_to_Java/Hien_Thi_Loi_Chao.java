package SS1.Introduction_to_Java;

import java.util.Scanner;

public class Hien_Thi_Loi_Chao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
