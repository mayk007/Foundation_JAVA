package Loop.src.For;

import java.util.Scanner;

public class for36 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N= ");
        int N = in.nextInt();
        System.out.print("K= ");
        int K = in.nextInt();

        int sum = 0;

        for (int i = 1; i <=N; i++) {
            sum += Math.pow(i,K);

            System.out.println(sum);
        }
    }
}

