// Author: Bekhzod Mustafaev
// Sana: 03.08.2021


package Input_output.begin_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        final double Pi = 3.14;
        System.out.println("(X1= \nY1= \nX2= \nY2=");
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();

        double M = Math.sqrt(Math.pow(X2-X1, 2) + Math.pow(Y2 - Y1,2));

        System.out.println("M=" + M);

    }
}