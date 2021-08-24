package Loop.src.For;

import java.util.Scanner;

public class for33 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>1), n= ");
        int n = in.nextInt();

        double F1 = 1;
        double F2 = 1;

        System.out.println("F1 = " + F1);
        System.out.println("F2 = " + F2);

        for (int i = 3; i <=n; i++) {

            // yangi F ni topish
            double Fn = F1 + F2;

            // F-2 va F-1
            F1 = Fn - F1;
            F2 = Fn;

            System.out.println("F" + i + " = " + Fn);
        }
    }
}


