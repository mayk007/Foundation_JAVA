package Function;

import java.util.Scanner;

public class FunSimple26 {
    static boolean IsPower5(int K){

        for (int i = 1; i < K; i++) {

            if (Math.pow(5,i) == K){
                return true;
            };
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("a,b,c > 0");
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        System.out.print("d = ");
        int d = sc.nextInt();

        System.out.print("e = ");
        int e = sc.nextInt();

        System.out.println(IsPower5(a));
        System.out.println(IsPower5(b));
        System.out.println(IsPower5(c));
        System.out.println(IsPower5(d));
        System.out.println(IsPower5(e));


    }
}
