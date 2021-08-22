package Loop.src.For;

import java.util.Scanner;

public class for20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        int factorial = 1;
        int Sum = 0;
        for (int i = 1; i <=n; i++) {
            factorial *=i;
            Sum += factorial;

        }
        System.out.println("1! dan " + n + "! gacha sonlar yig'indisi = " + Sum);



    }
}

