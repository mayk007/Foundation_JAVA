package Function;

import java.util.Scanner;

public class FunSimple31 {
    static boolean IsPolindrom(int N) {

        int i, temp = N, sum = 0;

        while (temp > 0) {
            i = temp % 10;
            temp = temp / 10;
            sum = sum * 10 + i;
        }
        return (sum == N);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(N>0), N = ");
        int N = sc.nextInt();

        System.out.println(N + " ta son kiriting:");

        for (int i = 1; i <= N; i++) {

            System.out.print("n" + i + "-son: ");
            int n = sc.nextInt();

            System.out.println(n + "==> " + IsPolindrom(n));
        }
    }
}
