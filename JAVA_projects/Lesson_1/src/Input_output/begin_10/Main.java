// Author: Bekhzod Mustafaev
// Sana: 03.08.2021


package Input_output.begin_10;

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
        double KV_a = Math.pow(a, 2);
        double KV_b = Math.pow(b, 2);


        System.out.println("Y=" + Y + "\nK=" + K + "\nKV_A=" + KV_a + "\nKV_B="+KV_b);



    }

}