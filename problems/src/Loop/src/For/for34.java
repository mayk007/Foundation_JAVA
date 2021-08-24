package Loop.src.For;

import java.util.Scanner;

public class for34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>1), n= ");
        int n = in.nextInt();

        double A1 = 1;
        double A2 = 2;

        System.out.println("A1 = " + A1);
        System.out.println("A2 = " + A2);

        for (int i = 3; i <=n; i++) {

            // yangi A ni topish
            double An = (A1 + 2 * A2)/3;

            // A-2 ba A-1
            A1 = (An*3-A1)/2;
            A2 = An;

            System.out.println("A" + i + " = " + An);
        }
    }
}


