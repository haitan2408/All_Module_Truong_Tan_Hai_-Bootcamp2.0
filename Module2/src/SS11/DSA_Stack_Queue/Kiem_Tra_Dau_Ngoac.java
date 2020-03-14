package SS11.DSA_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Kiem_Tra_Dau_Ngoac {
    public static boolean kiemTra(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(stack.empty()) {
                return false;
            }
            if ("(".equals(str.charAt(i))) {
                stack.push(String.valueOf(str.charAt(i)));
            } else if (")".equals(str.charAt(i))) {
                if (!stack.pop().equals(")"))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        boolean isKiemTra = kiemTra(str);
        if (isKiemTra) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
