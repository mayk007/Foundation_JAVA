package Loop.src.For;

import java.util.Scanner;

public class for4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1kg konfet narxi: ");
        double x = in.nextInt();

        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = i * x;
            System.out.println(i + " kg konfet narxi " + sum);

        }
    }
}
