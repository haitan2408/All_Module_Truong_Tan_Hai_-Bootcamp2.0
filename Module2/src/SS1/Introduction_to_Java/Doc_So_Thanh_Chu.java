package SS1.Introduction_to_Java;

import java.util.Scanner;

public class Doc_So_Thanh_Chu {
    public void readOneNum(int num) {
        switch (num) {
            case 1: {
                System.out.print("One");
                break;
            }
            case 2: {
                System.out.print("Two");
                break;
            }
            case 3: {
                System.out.print("three");
                break;
            }
            case 4: {
                System.out.print("four");
                break;
            }
            case 5: {
                System.out.print("five");
                break;
            }
            case 6: {
                System.out.print("Six");
                break;
            }
            case 7: {
                System.out.print("Seven");
                break;
            }
            case 8: {
                System.out.print("eight");
                break;
            }
            case 9: {
                System.out.print("Nine");
                break;
            }
            case 10: {
                System.out.print("Ten");
                break;
            }

        }
    }

    public void readTwoNum(int n) {
        int one;
        one = n % 10;
        switch (one) {
            case 1: {
                System.out.print("Eleven");
                break;
            }
            case 2: {
                System.out.print("Twelve");
                break;
            }
            case 3: {
                System.out.print("thirteen");
                break;
            }
            case 4: {
                System.out.print("fourteen");
                break;
            }
            case 5: {
                System.out.print("fifteen");
                break;
            }
            case 6: {
                System.out.print("Sixteen");
                break;
            }
            case 7: {
                System.out.print("Seventeen");
                break;
            }
            case 8: {
                System.out.print("eighteen");
                break;
            }
            case 9: {
                System.out.print("Nineteen");
                break;
            }
            case 10: {
                System.out.print("Twenty");
                break;
            }
        }
    }
    public void two(int two,int one) {
        switch (two) {
            case 2: {
                System.out.print("Twenty ");
                break;
            }
            case 3: {
                System.out.print("thirty ");
                break;
            }
            case 4: {
                System.out.print("forty ");
                break;
            }
            case 5: {
                System.out.print("fifty ");
                break;
            }
            case 6: {
                System.out.print("Sixty ");
                break;
            }
            case 7: {
                System.out.print("Seventy ");
                break;
            }
            case 8: {
                System.out.print("eighty ");
                break;
            }
            case 9: {
                System.out.print("Ninety ");
                break;
            }
            case 10: {
                System.out.print("one hundred ");
                break;
            }
        }
        readOneNum(one);
    }
    public void twoNumbers(int n) {
        int one;
        int two;
        one=n%10;
        two=n/10;
        two(two,one);
    }
    public void threeNum(int n) {
        int one;
        int two;
        int three;
        one = n % 10;
        n = n / 10;
        two = n % 10;
        three = n / 10;
        switch (three) {
            case 1: {
                System.out.print("One hundred and ");
                break;
            }
            case 2: {
                System.out.print("Two hundred and ");
                break;
            }
            case 3: {
                System.out.print("three hundred and ");
                break;
            }
            case 4: {
                System.out.print("four hundred and ");
                break;
            }
            case 5: {
                System.out.print("five hundred and ");
                break;
            }
            case 6: {
                System.out.print("Six hundred and ");
                break;
            }
            case 7: {
                System.out.print("Seven hundred and ");
                break;
            }
            case 8: {
                System.out.print("eight hundred and ");
                break;
            }
            case 9: {
                System.out.print("Nine hundred and ");
                break;
            }
        }
        if (two == 0) {
            readOneNum(one);
        } else if (two == 1) {
            readTwoNum(one);
        } else {
            two(two, one);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Doc_So_Thanh_Chu read = new Doc_So_Thanh_Chu();
        System.out.print("Nhap vao so ma ban muon doc: ");
        int num = scanner.nextInt();
        if (num <= 10) {
            read.readOneNum(num);
        } else if (num <= 20) {
            read.readTwoNum(num);
        }
        else if(num<=100) {
            read.twoNumbers(num);
        }
        else {
            read.threeNum(num);
        }

    }
}
