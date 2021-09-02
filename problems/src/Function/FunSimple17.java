package Function;

import java.util.Scanner;

public class FunSimple17 {
    static void KvTenglama(double a, double b, double c) {

        double D, x1, x2;

        // Diskriminantni topish
        D = Math.pow(b, 2) - 4 * a * c;

        // X1,X2 nomalumlarni topish
        x1 = (-b + Math.sqrt(D)) / (2 * a);
        x2 = (-b - Math.sqrt(D)) / (2 * a);

        if (D <=0){
            System.out.println("x1 = " + (-b) + " sqrt" + D + "/" + (2*a));
            System.out.println("x1 = " + (-b) + " sqrt" + -(D) + "/" + (2*a));
        } else {
            System.out.printf("X1 = %.2f \nX2 = %.2f", x1, x2 );
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(A!=0) A= ");
        double A = sc.nextDouble();
        System.out.print("B= ");
        double B = sc.nextDouble();
        System.out.print("C= ");
        double C = sc.nextDouble();

        KvTenglama(A,B,C);
    }
}
