package Loop.src.For;

import java.util.Scanner;

public class for39 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(A<B), A= ");
        int A = in.nextInt();
        System.out.print("(B>A), B= ");
        int B = in.nextInt();

        for (int i = A+1; i <B; i++) {
            System.out.println();
            for (int j = 1; j <=i; j++) {
                System.out.print(i + " ");
            }
        }
    }
}

