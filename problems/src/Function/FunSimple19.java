package Function;

import java.util.Scanner;

public class FunSimple19 {
    static double RingS(double r1, double r2){

        double S1, S2, Pi = Math.PI;
        S1 = Pi * Math.pow(r1,2);
        S2 = Pi * Math.pow(r2,2);

        return Math.abs(S1 - S2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("r1 = ");
        double r1 = sc.nextDouble();

        System.out.print("r2 = ");
        double r2 = sc.nextDouble();

        System.out.printf("Aylananinng kesishmaydigan qismining yuzasi %.2f ", RingS(r1, r2));
    }
}
