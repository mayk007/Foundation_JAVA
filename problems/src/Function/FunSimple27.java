package Function;

import java.util.Scanner;

public class FunSimple27 {
    static boolean IsPowerN(int K, int N){

        for (int i = 1; i < K; i++) {

            if (Math.pow(N,i) == K){
                return true;
            };
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("(K>0), K = ");
        int K = sc.nextInt();

        System.out.print("n1 = ");
        int n1 = sc.nextInt();

        System.out.print("n2 = ");
        int n2 = sc.nextInt();

        System.out.print("n3 = ");
        int n3 = sc.nextInt();

        System.out.print("n4 = ");
        int n4 = sc.nextInt();

        System.out.print("n5 = ");
        int n5 = sc.nextInt();

        System.out.println(IsPowerN(K, n1));
        System.out.println(IsPowerN(K, n2));
        System.out.println(IsPowerN(K, n3));
        System.out.println(IsPowerN(K, n4));
        System.out.println(IsPowerN(K, n5));
    }
}
