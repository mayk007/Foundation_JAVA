package Loop.src.For;

import java.util.Scanner;

public class for25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();
        System.out.print("|x|<1, x= ");
        double x = in.nextDouble();

        double Sum = 0;

        for (int i = 1; i <= n; i++) {

            Sum += Math.pow(-1,i-1) * Math.pow(x,i) / i;
            System.out.println(Sum);
        }
        System.out.printf("Natija = %.4f",Sum);
    }
}
