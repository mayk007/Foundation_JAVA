package Loop.src.For;

import java.util.Scanner;

public class for23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();
        System.out.print("x= ");
        double x = in.nextInt();

        int ishora = 1;
        double X = 1;
        int factorial = 1;
        double Sum = 0;

        for (int i = 1; i <= 2 * n + 1; i+=2) {
            for (int j = 1; j <=i ; j++) {
                factorial *= j;
            }
            X = Math.pow(x, i);
            Sum += ishora * X / factorial;
            ishora *= -1;
            factorial = 1;
            System.out.println(Sum);
        }
        System.out.printf("Natija = %.2f",Sum);
    }
}

