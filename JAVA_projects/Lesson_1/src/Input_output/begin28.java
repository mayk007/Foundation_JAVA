package Input_output;

import java.util.Scanner;

public class begin28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int A = sc.nextInt();

        int A2 = A*A;
        int A3 = A2 * A;
        int A5 = A3 * A2;
        int A10 = A5 * A5;
        int A15 = A10 * A5;

        System.out.format("A2=%d \nA3=%d \nA5=%d \nA10=%d \nA15=%d", A2, A3, A5, A10, A15);

    }
}
