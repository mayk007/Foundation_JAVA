package Input_output;

import java.util.Scanner;

public class begin27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int A = sc.nextInt();

        double A2 = Math.pow(A, 2);
        double A4 = A2 * A2;
        double A8 = A4 * A4;

        System.out.print("A2 = " + A2 + "\nA4=" + A4 + "\nA8=" + A8);

    }
}
