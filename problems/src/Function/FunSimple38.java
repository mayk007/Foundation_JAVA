package Function;

import java.util.Scanner;

public class FunSimple38 {

    static double Power2(double a, int n){

        if (n == 0){
            return 1;
        } else if (n>0){
            return Math.pow(a,n);
        }

        return (1/Math.pow(a,n));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        double A = sc.nextDouble();

        System.out.print("n = ");
        int n = sc.nextInt();

        System.out.print("m = ");
        int m = sc.nextInt();

        System.out.print("k = ");
        int k = sc.nextInt();


        System.out.printf("\n%.2f(%d) darajasi: %.2f ", A, n, Power2(A,n));
        System.out.printf("\n%.2f(%d) darajasi: %.2f ", A, m, Power2(A,m));
        System.out.printf("\n%.2f(%d) darajasi: %.2f ", A, k, Power2(A,k));

    }

}
