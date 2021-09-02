package Function;

import java.util.Scanner;

public class FunSimple30 {
    static int DigitN(int K, int N){

        int count = 0, n, temp = K;

        while (temp>0){

            n = temp % 10;
            temp = temp / 10;
            count++;

        }

        int i = count;

        while (i>0){

            n = K % 10;
            K = K / 10;

            if (i == N) {
                return n;
            }
            i--;
        }
        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = 3;
        System.out.println(K + " ta son kiriting!");


        for (int i = 1; i <= K; i++) {

            System.out.print("K" + i + "-sonni kiriting: ");
            int k = sc.nextInt();

            System.out.print("K" + i + " uchun n sonini kiriting: ");
            int n  = sc.nextInt();

            System.out.printf("%n%d ning %d-raqami:  %d\n", k, n,  DigitN(k,n));
        }
    }
}
