// Author: Bekhzod Mustafaev
// Sana: 03.08.2021


package Input_output.begin_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // double Pi = 3.14;
        System.out.println("(a,b ! = 0)\na= \nb= ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        double c = Math.sqrt((a*a)+(b*b));
        double P = a + b + c;


        System.out.println("c=" + c + "\nP=" + P );



    }

}