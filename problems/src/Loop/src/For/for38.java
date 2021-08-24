package Loop.src.For;

import java.util.Scanner;

public class for38 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <=n; i++) {

            // 1 dan n gacha bo'lgan qiymat oshgan sari daraja bittadan kamaysin va daraja 1 da to'xtasin
            double A= Math.pow(i,n+1-i);
            sum += (int)A;

            System.out.println(i + " ning " + (n+1-i) + " - darajasi = "+ A);
        }
        System.out.println("\n\nYig'indi = "+ sum);

    }
}

