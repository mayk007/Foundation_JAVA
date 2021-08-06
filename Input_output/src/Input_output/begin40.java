package Input_output;

import java.util.Scanner;

public class begin40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A1= ");
        double A1 = sc.nextDouble();
        System.out.print("B1= ");
        double B1 = sc.nextDouble();
        System.out.print("C1= ");
        double C1 = sc.nextDouble();

        System.out.print("A2= ");
        double A2 = sc.nextDouble();
        System.out.print("B2= ");
        double B2 = sc.nextDouble();
        System.out.print("C2= ");
        double C2 = sc.nextDouble();

        System.out.println((int)(A1) + " * x + " + (int) B1 + " * y = " + (int) C1);
        System.out.println((int)A2 + " * x + " + (int) B2 + " * y = " + (int)C2);

        double D = (A1 * B2 - A2 * B1);
        double x = (C1 * B2 - C2 * B1) / D;
        double y = (A1 * C2 - A2 * C1) / D;

        System.out.println("\nx= " + x + "\ny= " + y);

    }
}
