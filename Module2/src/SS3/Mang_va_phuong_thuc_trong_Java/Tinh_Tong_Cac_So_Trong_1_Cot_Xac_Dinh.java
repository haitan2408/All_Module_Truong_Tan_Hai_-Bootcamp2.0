package SS3.Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class Tinh_Tong_Cac_So_Trong_1_Cot_Xac_Dinh {
    public void sumOf1Column(int[][] array,int row) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter col: ");
        int sum=0;
        int column=scanner.nextInt();
        for(int i=0;i<row;i++) {
            sum+= array[i][column];
        }
        System.out.print("Sum of "+column+" column is: "+sum);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Tinh_Tong_Cac_So_Trong_1_Cot_Xac_Dinh sumOf1Column=new Tinh_Tong_Cac_So_Trong_1_Cot_Xac_Dinh();
        System.out.print("Enter row: ");
        int row=scanner.nextInt();
        System.out.print("Enter column: ");
        int col=scanner.nextInt();
        System.out.print("Enter element of Array: ");
        int[][] array=new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                array[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\r\n");
        }
        sumOf1Column.sumOf1Column(array,row);
    }
}
