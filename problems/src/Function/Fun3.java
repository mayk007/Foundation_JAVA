package Function;

import java.util.Scanner;

public class Fun3 {

    public static void Mean(double a, double b){

        // O'rta arifmetik
        double arif = (a + b )/ 2;

        // O'rta geometrik
        double geo = Math.sqrt(a * b);

        System.out.println("Berilgan sonlar o'rta Arifmetigi " + arif);
        System.out.println("Berilgan sonlar o'rta Geometigi " + geo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A,B,C,D;

        System.out.print("A = ");
        A = sc.nextDouble();

        System.out.print("B = ");
        B = sc.nextDouble();

        System.out.print("C = ");
        C = sc.nextDouble();

        System.out.print("D = ");
        D = sc.nextDouble();

        Mean(A,B);
        Mean(A,C);
        Mean(A,D);
    }
}
