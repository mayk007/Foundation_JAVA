package Function;

import java.util.Scanner;

public class FunSimple25 {
    static boolean IsSquare(int K){

        // 1-usul
        //double ildiz = Math.sqrt(K);
        //return (ildiz-Math.floor(ildiz) == 0);


        for (int i = 1; i <K; i++) {

            if (i*i==K){
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

        System.out.println(IsSquare(a));
        System.out.println(IsSquare(b));
        System.out.println(IsSquare(c));

    }
}
