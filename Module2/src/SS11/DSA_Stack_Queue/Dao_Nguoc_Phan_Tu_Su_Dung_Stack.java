package SS11.DSA_Stack_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Dao_Nguoc_Phan_Tu_Su_Dung_Stack {
    static Scanner scanner = new Scanner(System.in);

    public static List<Integer> inputArray(List<Integer> arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("Input element " + i + ": ");
            arr.add(Integer.valueOf(scanner.nextLine()));
        }
        return arr;
    }

    public static List<Integer> reverseArray(List<Integer> arr) {
        Stack<Integer> stack = new Stack<>();
        for (Integer element : arr) {
            stack.push(element);
        }
        arr = new ArrayList<>();
        while (!stack.empty()) {
            arr.add(stack.pop());
        }
        return arr;
    }

    public static String reveseString(String str) {
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            strings.push(String.valueOf(str.charAt(i)));
        }
        String result="";
        while (!strings.empty()) {
            result+=strings.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        //Reverse Array use Stack
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int length = Integer.valueOf(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        list = inputArray(list, length);
        list = reverseArray(list);
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
        //Reverse String use Stack
        System.out.print("Enter String: ");
        String str = scanner.nextLine();
        str = reveseString(str);
        System.out.println("Result: " + str);

    }
}
