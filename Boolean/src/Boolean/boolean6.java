package Boolean;

import java.util.Scanner;

public class boolean6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A=");
        int A = sc.nextInt();
        System.out.print("B=");
        int B = sc.nextInt();
        System.out.print("C=");
        int C = sc.nextInt();

        boolean D = A <= B && B <= C;

        System.out.println(D);

    }
}
