package Loop.src.For;

import java.util.Scanner;

public class for13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        int ishora = 1;
        double S = 0;

        for (int i = 1; i <=n ; i++) {
            S += ishora * (1+i*0.1); // butun son yasab olib ishoraga ko'paytirish
            ishora *= -1; // ishorani o'zgartish
            System.out.println(S);
        }

        System.out.println("Natija =" + S);
     }
}

