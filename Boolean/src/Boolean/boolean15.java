package Boolean;

import java.util.Scanner;

public class boolean15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A=");
        int A = sc.nextInt();
        System.out.print("B=");
        int B = sc.nextInt();
        System.out.print("C=");
        int C = sc.nextInt();

        boolean D = A > 0 && B > 0 && C <= 0 || A > 0 && B <= 0 && C > 0 || A <= 0 && B > 0 && C > 0;

        System.out.println(D);

    }
}
