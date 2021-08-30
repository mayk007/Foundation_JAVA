package Function;

import java.util.Scanner;

public class Fun2 {

    static void PowerA234(double a){
      double A,B,C;

        A = Math.pow(a,2);
        B = Math.pow(a,3);
        C = Math.pow(a,4);
        System.out.println(A + " " + B + " " + C);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        double A = sc.nextDouble();

        System.out.print("B = ");
        double B = sc.nextDouble();

        System.out.print("C = ");
        double C = sc.nextDouble();

        System.out.print("D = ");
        int D = sc.nextInt();

        System.out.print("E = ");
        int E = sc.nextInt();



        System.out.print("A(2,3,4) = ");  PowerA234(A);
        System.out.print("B(2,3,4) = ");  PowerA234(B);
        System.out.print("B(2,3,4) = ");  PowerA234(C);
        System.out.print("B(2,3,4) = ");  PowerA234(D);
        System.out.print("B(2,3,4) = ");  PowerA234(E);


    }

}
