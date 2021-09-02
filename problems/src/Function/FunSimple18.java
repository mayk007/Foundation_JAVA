package Function;

import java.util.Scanner;

public class FunSimple18 {
    static double DoiraYuzi(double r){

        double S, Pi = Math.PI;
        S  = Pi * Math.pow(r,2);

        return S;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("r1 = ");
        double r1 = sc.nextDouble();

        System.out.print("r2 = ");
        double r2 = sc.nextDouble();

        System.out.print("r3 = ");
        double r3 = sc.nextDouble();

        System.out.println("1 - Doira  yuzi: " +  DoiraYuzi(r1));
        System.out.println("2 - Doira  yuzi: " +  DoiraYuzi(r2));
        System.out.println("2 - Doira  yuzi: " +  DoiraYuzi(r3));

    }
}
