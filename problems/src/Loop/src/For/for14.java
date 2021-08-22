package Loop.src.For;

import java.util.Scanner;

public class for14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        double S = 0;
        for (int i = 1; i <=2*n-1; i++) {
            if (i % 2 !=0){
                S += i;
                System.out.println(S);
            };
        }
        System.out.println("Natija: " + S);

    }
}

