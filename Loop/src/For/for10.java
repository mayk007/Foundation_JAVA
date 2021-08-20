package For;

import java.util.Scanner;

public class for10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
         int n = in.nextInt();

         double S = 0.0;
        for (int i = 1; i <= n; i++) {

           // if (n%2!=0){
             //   S += 1 + 1/n;}
            S = S + 1/i;
        }
        System.out.println(S);
    }
}

