package Case;

import java.util.Scanner;

public class case18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n (100<=n<=999): ");
        int n = sc.nextInt();

        final String empty = "";
        final String[] X = {empty, "Bir ", "Ikki ", "Uch ", "To'rt ", "Besh ", "Olti ",
                "Yetti ", "Sakkiz ", "To'qqiz "};
//        System.out.println(X[5]);

        final String[] Y = {
                empty, "O'n ", "Yigirma ", "O'ttiz ", "Qirq ", "Ellik ",
                "Oltmish ", "Yetmish ", "Sakson ", "To'qson "
        };
        final String[] Z = {empty, "Bir yuz ", "Ikki yuz ", "Uch yuz ", "To'rt yuz ", "Besh yuz ", "Olti yuz ",
                "Yetti yuz ", "Sakkiz yuz ", "To'qqiz yuz "};

        // if 'Y' is zero
        if (n == 0) {
            System.out.println("Zero");
        }
        // split 'Y' if it is more than 19
        if (n >= 100 && n <= 999) {
            System.out.println(Z[n / 100] + Y[n % 100 / 10] + X[n % 10]);
        } else {
            System.out.println("Iltimos 100 va 999 ralig'idagi sonni kiriting!");
        }
    }
}

