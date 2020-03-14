package SS3.Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class Tim_Phan_Tu_Max_Trong_Mang_2_Chieu {
    public void maxArray(int[][] array,int row,int col) {
        int max=array[0][0];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.print("Max of Array is : "+max);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Tim_Phan_Tu_Max_Trong_Mang_2_Chieu max_2_dimensionalArrays=new Tim_Phan_Tu_Max_Trong_Mang_2_Chieu();
        System.out.print("Enter row: ");
        int row=scanner.nextInt();
        System.out.print("Enter column: ");
        int col=scanner.nextInt();
        System.out.print("Enter element of the table: ");
        int[][] array=new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                array[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(array[i][j]);
            }
            System.out.print("\r\n");
        }
        max_2_dimensionalArrays.maxArray(array,row,col);
    }
}
