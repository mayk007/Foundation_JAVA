package Boolean;

import java.util.Scanner;

public class boolean23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, yuz, bir;

        System.out.print("Uch xonali sonni kiriting ");
        A = sc.nextInt();

        yuz = A / 100;
        bir = A % 10;

        boolean D = (yuz == bir);

        System.out.println(D);

    }
}
