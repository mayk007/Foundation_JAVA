package Function;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FunSimple35 {
    static int Fact2(int N){

        int temp = 0;
        if (N == 1){
            return 1;
        }
        if (N == 2){
            return 2;
        }

        temp += 2;
        return N * Fact2(N - temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(n>0) n1 = ");
        int n1 = sc.nextInt();

        System.out.print("(n>0) n2 = ");
        int n2 = sc.nextInt();

        System.out.print("(n>0) n3 = ");
        int n3 = sc.nextInt();

        System.out.println(n1 + "! = " + Fact2(n1));
        System.out.println(n2 + "! = " + Fact2(n2));
        System.out.println(n3 + "! = " + Fact2(n3));


    }
}

