package Loop.src.For;

import java.util.Scanner;

public class for40 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(A<B), A= ");
        int A = in.nextInt();
        System.out.print("(B>A), B= ");
        int B = in.nextInt();

        int count = 0;
        for (int i = A; i <=B; i++) {
            System.out.println();

            for (int j = 1; j <=count+1; j++) {

                System.out.print(i + " ");

            }
            count +=1;
        }
    }
}

