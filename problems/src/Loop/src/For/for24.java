package Loop.src.For;

import java.util.Scanner;

public class for24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();
        System.out.print("x= ");
        double x = in.nextDouble();

//        int ishora = 1;
//        double X = 1;
//        int factorial = 1;
//        double Sum = 0;
//
//        for (int i = 0; i <= 2*n; i+=2) {
//            for (int j = 1; j <=i ; j++) {
//                factorial *= j;
//            }
//            X = Math.pow(x, i);
//            Sum += ishora * X / factorial;
//            ishora *= -1;
//            factorial = 1;
//            System.out.println(Sum);
//        }
//        System.out.printf("Natija = %.2f",Sum);

        //2-usul
        int factorial = 1;
        double Sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=2*i; j++) {
                factorial *= j;
            }

            Sum += Math.pow(-1,i) * Math.pow(x,2*i) / factorial;
            factorial = 1;
            System.out.println(Sum);
        }
        System.out.printf("Natija = %.2f",Sum);

    }
}
