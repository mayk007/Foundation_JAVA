package Loop.src.For;

import java.util.Scanner;

public class for12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        double S = 1;
        for (int i = 1; i <=n ; i++) {
            double temp = 1 + (i*0.1);
            S *= temp;
            System.out.println(S);
        }



    }
}

