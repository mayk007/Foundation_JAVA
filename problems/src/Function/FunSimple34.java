package Function;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FunSimple34 {
    static int Fact(int N){

        if (N == 1){
            return 1;
        }

        return N * Fact(N - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n1 = ");
        int n1 = sc.nextInt();

        System.out.print("n2 = ");
        int n2 = sc.nextInt();

        System.out.print("n3 = ");
        int n3 = sc.nextInt();

        System.out.println(n1 + "! = " + Fact(n1));
        System.out.println(n2 + "! = " + Fact(n2));
        System.out.println(n3 + "! = " + Fact(n3));


    }
}

