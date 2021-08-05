// Author: Bekhzod Mustafaev
// Sana: 03.08.2021


package Input_output.begin_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        final double Pi = 3.14;
        System.out.println("X1= \nX2=");
        int X1 = sc.nextInt();
        int X2 = sc.nextInt();

        double M = Math.abs(X1-X2);

        System.out.println("M=" + M);

    }

}