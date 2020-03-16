package SS9.Automated_Testing_va_TDD.NextDay;


public class NextDay {
    public static String nextDay(int day, int month, int year) {
        if (month == 12){
            day = 1;
            month = 1;
            year += 1;
        }
        else if (day == 31){
            day = 1;
            month+=1;
        }else {
            day += 1;
        }
        return day + "/" + month + "/" + year;
    }

}
