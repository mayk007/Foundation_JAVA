package Loop.src.For;

import java.util.Scanner;

public class for37 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N = ");
        int N = in.nextInt();

        int sum = 0;

        for (int i = 1; i <=N; i++) {
            double A= Math.pow(i,i);
            sum += (int)A;

            System.out.println(i + " ning " + i + " - darajasi = "+ A);
        }
        System.out.println("\n\nYig'indi = "+ sum);

    }
}

