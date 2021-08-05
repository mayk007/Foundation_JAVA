// Author: Bekhzod Mustafaev
// Sana: 03.08.2021


package Input_output.begin_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // double Pi = 3.14;
        System.out.println("(a,b ! = 0)\na= \nb= ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        double Y = a + b;
        double K = a * b;
        double M_a = Math.abs(a);
        double M_b = Math.abs(b);


        System.out.println("Y=" + Y + "\nK=" + K + "\nM_a=" + M_a + "\nM_b=" + M_b);



    }

}