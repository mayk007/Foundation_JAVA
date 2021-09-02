package Function;

import java.util.Scanner;

public class FunSimple24 {
    static boolean Even(int K){

        return K % 2 == 0;

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

        System.out.println(Even(a));
        System.out.println(Even(b));
        System.out.println(Even(c));

    }
}
