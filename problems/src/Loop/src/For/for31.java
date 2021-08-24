package Loop.src.For;

import java.util.Scanner;

public class for31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        // buyerda /A(k-1) bo'lgani  uchun A ning bitta oldingi qiymatini olib ketaveramiz
        double A = 2;

        for (int i = 1; i <=n; i++) {

           double b = 2+1/A;
            A = b;
            System.out.println("A" + i + " = " + b);
        }
    }
}

