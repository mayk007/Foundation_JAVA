package Loop.src.For;

import java.util.Scanner;

public class for11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();


        int S = n*n;
        for (int i = 1; i <=Math.pow(2*n,2); i++) {
            S += Math.pow(n+i,2);
            System.out.println(S);
        }
        System.out.println("S" + "=" + S);

    }
}

