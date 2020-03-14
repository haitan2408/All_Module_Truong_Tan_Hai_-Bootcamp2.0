package SS4.Lop_va_doi_tuong_trong_Java;

import java.util.Scanner;

public class Phuong_Trinh_Bac_2 {
    private double a;
    private double b;
    private double c;

    public Phuong_Trinh_Bac_2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.b,2)) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
        }
        return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
        }
        return 0;
    }

    public void display() {
        if (getDiscriminant() > 0) {
            System.out.print("Phuong trinh co 2 nghiem la: " + getRoot1() + " va: " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.print("Phuong trinh co 1 nghiem kep la: " + getRoot1());
        } else System.out.print("The equation has no roots!");
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 3 coefficients of the quadratic equation: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        Phuong_Trinh_Bac_2 quadraticEquation = new Phuong_Trinh_Bac_2(a, b, c);
        quadraticEquation.display();

    }
}
