package SS3.Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class Them_Phan_Tu_Vao_Mang { Scanner scanner = new Scanner(System.in);

    public void insertNumber(int[] listNum) {
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        if (index < 0 || index > listNum.length) {
            System.out.print("Not insert!");
        }
        int[] newList = new int[listNum.length + 1];
        for (int i = 0; i < index; i++) {
            newList[i] = listNum[i];
        }
        newList[index] = number;
        for (int i = index + 1; i < newList.length; i++) {
            newList[i] = listNum[i - 1];
        }
        System.out.print("New list number: ");
        for (int i = 0; i < newList.length; i++) {
            System.out.print(newList[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Them_Phan_Tu_Vao_Mang insertNumber = new Them_Phan_Tu_Vao_Mang();
        System.out.print("Enter element number of list: ");
        int number = scanner.nextInt();
        int[] listNum = new int[number];
        System.out.print("Enter List number: ");
        for (int i = 0; i < number; i++) {
            listNum[i] = scanner.nextInt();
        }
        insertNumber.insertNumber(listNum);
    }
}
