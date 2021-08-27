package Loop.src.While;

import java.util.Scanner;

public class while28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(e = ");
        double e = sc.nextDouble();

        double a1 = 2, k = 2;
        double a2 = 2 + 1 / a1;
        double Ak = a2;

        while (Math.abs(Ak - (a1)) <= e) {

            double a3 = 2 + 1 / a2;
            System.out.println("A" + k + a1 + "\tAk = " + Ak);
            a2 = a3;
            a1 = a2;
            Ak = a3;
            k++;
        }
        System.out.println(k);

    }
}

