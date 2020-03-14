package SS11.DSA_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Chuyen_Thap_Phan_Sang_Nhi_Phan {
    public static String convert(int num) {
        Stack<Integer> strings=new Stack<>();
        String str="";
        int result=0;
        while (num!=0) {
            result=num%2;
            strings.push(result);
            num=num/2;
        }
        while (!strings.empty()) {
            str+=strings.pop();
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.println("Result: "+Chuyen_Thap_Phan_Sang_Nhi_Phan.convert(scanner.nextInt()));
    }
}
