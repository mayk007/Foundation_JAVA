// Author: Bekhzod Mustafaev
// Sana: 03.08.2021


package Input_output.begin_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        final double Pi = 3.14;
        System.out.println("(X1,Y1) (X2,Y2) > 0");
        System.out.println("(X1= \nY1= \nX2= \nY2=");
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();

        double P = Math.abs((X1-X2) * 2 + (Y1-Y2) * 2);
        double S = Math.abs((X1-X2)* (Y1-Y2));

        System.out.println("P=" + P + "\nS=" + S);

    }
}