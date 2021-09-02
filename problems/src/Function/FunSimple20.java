package Function;

import java.util.Scanner;

public class FunSimple20 {
    static double TriangleP(double a, double b){

        double c, P;

        // gipotinuza
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        // Permetr
        P = a + b + c;

        return P;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        System.out.printf("Tomonlari %.2f va %.2f bo'lgan to'gri burchakli uchburchaklarning yuzi: %.2f ", a, b, TriangleP(a,b));

    }
}
