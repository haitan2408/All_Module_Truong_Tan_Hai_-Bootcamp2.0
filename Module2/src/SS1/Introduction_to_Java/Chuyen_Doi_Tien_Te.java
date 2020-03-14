package SS1.Introduction_to_Java;

import java.util.Scanner;

public class Chuyen_Doi_Tien_Te {
    public static void main(String[] args) {
        final double rate=23000;
        double usd;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Moi ban nhap so tien USD: ");
        usd=scanner.nextDouble();
        double result = usd * rate;
        System.out.println("So tien sau khi da quy doi sang VND: "+result);


    }
}
