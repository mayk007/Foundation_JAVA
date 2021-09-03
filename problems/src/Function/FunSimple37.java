package Function;

import java.util.Scanner;

public class FunSimple37 {

    static double Power(double a, double b){

        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        double A = sc.nextDouble();

        System.out.print("A1 = ");
        double A1 = sc.nextDouble();

        System.out.print("A2 = ");
        double A2 = sc.nextDouble();

        System.out.print("A3 = ");
        double A3 = sc.nextDouble();

        System.out.print("B = ");
        double B = sc.nextDouble();

        System.out.printf("\n%.2f(%.2f) darajasi: %.2f ", A, B, Power(A,B));
        System.out.printf("\n%.2f(%.2f) darajasi: %.2f ", A1, B, Power(A1,B));
        System.out.printf("\n%.2f(%.2f) darajasi: %.2f ", A2, B, Power(A2,B));
        System.out.printf("\n%.2f(%.2f) darajasi: %.2f ", A3, B, Power(A3,B));

    }

}
