package Loop.src.For;

import java.util.Scanner;

public class for22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();
        System.out.print("x= ");
        double x = in.nextInt();

        double X = 1;
        int factorial = 1;
        double Sum = 1;
        for (int i = 1; i <=n; i++) {

            X = Math.pow(x,i);
            factorial *=i;
            Sum += X/factorial;
            System.out.println(Sum);
        }
        System.out.printf("1 + x+ x2/(2!) ....+xn/(%d!) ifodadagi sonlar yig'indisi = %.2f",n , Sum);
    }
}

