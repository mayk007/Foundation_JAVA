package Boolean;

import java.util.Scanner;

public class boolean10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A=");
        int A = sc.nextInt();
        System.out.print("B=");
        int B = sc.nextInt();

        boolean D = A % 2 != 0 && B % 2 == 0 || A % 2 == 0 && B % 2 != 0;

        System.out.println(D);

    }
}
