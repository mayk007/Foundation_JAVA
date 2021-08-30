package MinMax;

import java.util.Scanner;

public class minmax1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, n, Min, Max;

        System.out.print("N = ");
        N = sc.nextInt();

        System.out.print(N + " ta son kiriting \n1-son: " );
        n = sc.nextInt();

        Min = n;
        Max = n;

        for (int i = 2; i <=N; i++) {

            System.out.print(i + " -sonni kiriting: ");
            n = sc.nextInt();

            if (Min>n) Min = n;
            if (Max<n) Max = n;

        }
        System.out.println("Min:" + Min);
        System.out.println("Max:" + Max);


    }
}
