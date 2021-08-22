package Loop.src.For;

import java.util.Scanner;

public class for25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();
        System.out.print("x= ");
        double x = in.nextInt();

        double X = 1;
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
//
//public class for24 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Butun son kiriting:");
//        System.out.print("n = ");
//        int n = sc.nextInt();
//        System.out.println("Haqiqiy son kiriting:");
//        System.out.print("x = ");
//        float x = sc.nextFloat();
//        double pi = Math.atan(1)*4;
//
//        int maxraj;
//        float sum = 1;
//        x *= pi / 180;
//        float surat = 1;
//        float ishora = 1;
//
//        for (int i = 2; i <= n; i = i + 2) {
//
//            maxraj = 1;
//            surat = 1;
//            ishora *= - 1;
//            for (int j = 1; j <= i; j++) {
//                maxraj *= j;
//                surat *= x;
//            }
//
//            sum += ishora * surat / maxraj;
//
//        }
//
//        System.out.println(" summa  = " + sum);
//
//    }
//}
