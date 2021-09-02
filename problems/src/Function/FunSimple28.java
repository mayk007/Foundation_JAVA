package Function;

import java.util.Scanner;

public class FunSimple28 {
    static boolean IsPrime(int N){

        for (int i = 2; i < N; i++) {
            if (N % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        System.out.println(IsPrime(n1));
        System.out.println(IsPrime(n2));
        System.out.println(IsPrime(n3));
        System.out.println(IsPrime(n4));
        System.out.println(IsPrime(n5));

    }
}
