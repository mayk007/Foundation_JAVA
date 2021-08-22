package Loop.src.For;

import java.util.Scanner;

public class for6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1kg konfet narxi: ");
        double x = in.nextInt();

        double sum = 0;

        for (int i = 2; i <= 10; i += 2) {

            double a = x / 1000 * 100; // 100 gram konfet narxi
            sum = x + i * a;
            System.out.println((i * 0.1 + 1) + " kg konfet narxi " + sum);

        }
    }
}
