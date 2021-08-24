package Loop.src.For;

import java.util.Scanner;

public class for35 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>2), n= ");
        int n = in.nextInt();

        double A1 = 1;
        double A2 = 2;
        double A3 = 3;


        System.out.println("A1 = " + A1);
        System.out.println("A2 = " + A2);
        System.out.println("A3 = " + A3);


        for (int i = 4; i <= n; i++) {

            // yangi A ni topish
            double An = (A3 + A2) - (2 * A1);

            // A-3, A-2 ba A-1 larni topib olamiz
            A1 = A3 + A2 - An;
            A1 = A1 / 2;
            A2 = (An + 2 * A1) - A3;
            A3 = (An + 2 * A1) - A2;

            // o'zgaruvchi qiymatlarni mos ravishda o'zlastirib olamiz
            A1 = A2;
            A2 = A3;
            A3 = An;


            System.out.println("A" + i + " = " + An);
        }
    }
}


