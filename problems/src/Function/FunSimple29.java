package Function;

import java.util.Scanner;

public class FunSimple29 {
    static int DigitCount(int K){

        int count = 0, n;

        while (K>0){

            n = K % 10;
            K = K / 10;
            count++;


        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(K>0), K = ");
        int K = sc.nextInt();

        System.out.println(K + " ta son kiriting!");

        int count = 0;

        for (int i = 1; i <= K; i++) {

            count += 1;
            System.out.print(i + "-sonni kiriting: ");
            count = sc.nextInt();
            System.out.println(count + "soni " + DigitCount(count) + " ta qaramdan iborat!");

        }

    }
}
