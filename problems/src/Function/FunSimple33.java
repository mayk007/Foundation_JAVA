package Function;

import java.util.Scanner;

public class FunSimple33 {
    static double RadToDeg(double R){

        double Pi = Math.PI;

        return R * (180/Pi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(0>D<360), R1 = ");
        double R1 = sc.nextDouble();

        System.out.print("(0>D<360), R2 = ");
        double R2 = sc.nextDouble();

        System.out.print("(0>D<360), R3 = ");
        double R3 = sc.nextDouble();

        System.out.printf("%.1f gradus  = %.2f Rad.\n", R1, RadToDeg(R1));
        System.out.printf("%.1f gradus  = %.2f Rad.\n", R2, RadToDeg(R2));
        System.out.printf("%.1f gradus  = %.2f Rad.\n", R3, RadToDeg(R3));

    }

}
