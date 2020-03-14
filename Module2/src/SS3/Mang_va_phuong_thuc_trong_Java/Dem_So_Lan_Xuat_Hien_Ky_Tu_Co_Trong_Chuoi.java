package SS3.Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class Dem_So_Lan_Xuat_Hien_Ky_Tu_Co_Trong_Chuoi {
    public void countCharacters(String str) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter character: ");
        char character = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.print("Number of occurrences of " + character + " is: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dem_So_Lan_Xuat_Hien_Ky_Tu_Co_Trong_Chuoi countCharacters = new Dem_So_Lan_Xuat_Hien_Ky_Tu_Co_Trong_Chuoi();
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        countCharacters.countCharacters(str);

    }
}
