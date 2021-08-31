package Function;

import java.util.Scanner;

public class FunSample10 {

    static double PowerA3(double a) {
        return Math.pow(a, 3);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        int D, E;

        System.out.print("A = ");
        A = sc.nextDouble();

        System.out.print("B = ");
        B = sc.nextDouble();

        System.out.print("C = ");
        C = sc.nextDouble();

        System.out.print("D = ");
        D = sc.nextInt();

        System.out.print("E = ");
        E = sc.nextInt();

        System.out.println("A(3) darajasi = " + PowerA3(A));
        System.out.println("B(3) darajasi = " + PowerA3(B));
        System.out.println("C(3) darajasi = " + PowerA3(C));
        System.out.println("D(3) darajasi = " + PowerA3(D));
        System.out.println("E(3) darajasi = " + PowerA3(E));

    }
}