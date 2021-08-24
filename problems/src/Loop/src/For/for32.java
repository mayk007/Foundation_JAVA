package Loop.src.For;

import java.util.Scanner;

public class for32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        // buyerda /A(k-1) bo'lgani  uchun A ning bitta oldingi qiymatini olib ketaveramiz
        double A = 1;

        for (int i = 1; i <=n; i++) {

            double b = (A + 1)/i;
            A = b;
            System.out.println("A" + i + " = " + b);
        }
    }
}

