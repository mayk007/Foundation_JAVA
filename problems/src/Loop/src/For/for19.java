package Loop.src.For;

import java.util.Scanner;

public class for19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        int Sum = 1;
        for (int i = 1; i <=n; i++) {
            Sum *=i;
            System.out.println(Sum);
        }
        System.out.println(n + "! = " + Sum);



    }
}

