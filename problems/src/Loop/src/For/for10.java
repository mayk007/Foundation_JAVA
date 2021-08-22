package Loop.src.For;

import java.util.Scanner;

public class for10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        double S = 0.0;
        for (double i = 1; i <=n ; i++) {
            S += 1/i;
            System.out.println(S);
        }
        System.out.printf("\nS = %.2f", S);
    }
}

