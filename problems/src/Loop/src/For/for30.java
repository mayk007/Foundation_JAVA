package Loop.src.For;

import java.util.Scanner;

public class for30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(A<B)A =");
        double A = in.nextDouble();
        System.out.print("B =");
        double B = in.nextDouble();
        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        double sum = Math.abs(A-B)/n;
        for (double i = A; i <=B; i+=sum) {

            System.out.println(1-Math.sin(i));
        }
    }
}

