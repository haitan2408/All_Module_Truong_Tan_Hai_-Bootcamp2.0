package SS11.DSA_Stack_Queue;

import java.util.*;

public class Chuoi_Palindrome {
    public static Stack<String> addStack(String str) {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<str.length();i++) {
            stack.push(String.valueOf(str.charAt(i)));
        }
        return stack;
    }
    public static Queue<String> addQueue(String str) {
        Queue<String> queue=new LinkedList<>();
        for(int i=0;i<str.length();i++) {
            queue.add(String.valueOf(str.charAt(i)));
        }
        return queue;
    }
    public static boolean compare(Stack<String> stack,Queue<String> queue) {
        while (!stack.empty()) {
            if(!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=scanner.nextLine();
        boolean isPalindrome=compare(addStack(str), addQueue(str));
        if(isPalindrome) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not is Palindrome");
        }
    }
}
