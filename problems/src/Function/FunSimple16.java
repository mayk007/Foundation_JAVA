package Function;

import java.util.Scanner;

public class FunSimple16 {


    static double Ishora(double a) {

        if (a<0){
            return -1;
        } else if (a>0){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B;

        System.out.print("A = ");
        A = sc.nextDouble();

        System.out.print("B = ");
        B = sc.nextDouble();

        System.out.print(Ishora(A)+ " + " + Ishora(B)  + " = " + (Ishora(A) + Ishora(B)));

    }
}