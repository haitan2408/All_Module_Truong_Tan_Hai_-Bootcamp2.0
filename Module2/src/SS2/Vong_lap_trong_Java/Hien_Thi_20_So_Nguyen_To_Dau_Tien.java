package SS2.Vong_lap_trong_Java;

import java.util.Scanner;

public class Hien_Thi_20_So_Nguyen_To_Dau_Tien {
    public  boolean checkIsPrime(int i) {
        if (i < 2) return false;
        for (int j = 2; j < (i-1); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
    public void displayMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Nhap vao so luong so nguyen to can in ra: ");
        num = scanner.nextInt();
        int count = 0;
        int n=2;
        while (count < num) {
            if (checkIsPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
    public static void main(String[] args) {
        Hien_Thi_20_So_Nguyen_To_Dau_Tien main=new Hien_Thi_20_So_Nguyen_To_Dau_Tien();
        main.displayMenu();
    }
}
