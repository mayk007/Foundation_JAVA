package Loop.src.For;

import java.util.Scanner;

public class for18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(a>0), Son a= ");
        double a = in.nextDouble();
        System.out.print("(n>0), Daraja n= ");
        int n = in.nextInt();

        int ishora = 1;
        double Sum = 1;

        for (int i = 1; i <= n; i++) {
            ishora *= -1;
            Sum += ishora * Math.pow(a, i);



            System.out.println(Sum);

        }
        System.out.println(a + " ning 1 dan " + n + " gacha darajalar +- yig'indisi = " + Sum);

    }
}

