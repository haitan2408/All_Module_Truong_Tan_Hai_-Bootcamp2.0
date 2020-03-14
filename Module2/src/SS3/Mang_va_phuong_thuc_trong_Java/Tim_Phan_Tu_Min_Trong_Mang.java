package SS3.Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class Tim_Phan_Tu_Min_Trong_Mang {
    public void minArray(int[] array) {
        int minArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minArray > array[i]) {
                minArray = array[i];
            }
        }
        System.out.print("Min number of Array: " + minArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of Array: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.print("the Array is: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Tim_Phan_Tu_Min_Trong_Mang minArray = new Tim_Phan_Tu_Min_Trong_Mang();
        minArray.minArray(array);
    }
}
