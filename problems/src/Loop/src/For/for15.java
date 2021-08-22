package Loop.src.For;

import java.util.Scanner;

public class for15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(a>0), Son a= ");
        double a = in.nextDouble();
        System.out.print("(n>0), Daraja n= ");
        int n = in.nextInt();


        double Sum = 1;
        for (int i = 1; i <= n; i++) {
            Sum *= a;
        }
        System.out.println(a + " ning " + n + " - darajasi = "+ Sum);
    }
}

