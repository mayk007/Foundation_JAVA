package Function;

import java.util.Scanner;

public class FunSimple32 {
    static double DegToRad(double D){

        double Pi = Math.PI;

        return D * (Pi/180);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(0>D<360), D1 = ");
        double D1 = sc.nextDouble();

        System.out.print("(0>D<360), D2 = ");
        double D2 = sc.nextDouble();

        System.out.print("(0>D<360), D3 = ");
        double D3 = sc.nextDouble();

        System.out.printf("%.1f gradus  = %.2f Rad.\n", D1, DegToRad(D1));
        System.out.printf("%.1f gradus  = %.2f Rad.\n", D2, DegToRad(D2));
        System.out.printf("%.1f gradus  = %.2f Rad.\n", D3, DegToRad(D3));

    }

}
