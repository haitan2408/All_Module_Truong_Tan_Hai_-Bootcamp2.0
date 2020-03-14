package SS2.Vong_lap_trong_Java;

public class Hien_Thi_So_Nguyen_To_Nho_Hon_100 {
    public boolean checkIsPrime(int i)
    {
        if(i<2) return false;
        for(int j=2;j<(i-1);j++)
            if(i%j==0) return false;
        return true;
    }
    public void displayMenu()
    {
        for(int n=2;n<=100;n++)
        {
            if(checkIsPrime(n))
                System.out.print(n+" ");

        }
    }
    public static void main(String[] args) {
        Hien_Thi_So_Nguyen_To_Nho_Hon_100 main=new Hien_Thi_So_Nguyen_To_Nho_Hon_100();
        main.displayMenu();
    }
}
