package Case;

import java.util.Scanner;

public class case18 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("n (100<=n<=999): ");
//        int n = sc.nextInt();
//
//        final String empty = "";
//        final String[] X = {empty, "Bir ", "Ikki ", "Uch ", "To'rt ", "Besh ", "Olti ",
//                "Yetti ", "Sakkiz ", "To'qqiz "};
////        System.out.println(X[5]);
//
//        final String[] Y = {
//                empty, "O'n ", "Yigirma ", "O'ttiz ", "Qirq ", "Ellik ",
//                "Oltmish ", "Yetmish ", "Sakson ", "To'qson "
//        };
//        final String[] Z = {empty, "Bir yuz ", "Ikki yuz ", "Uch yuz ", "To'rt yuz ", "Besh yuz ", "Olti yuz ",
//                "Yetti yuz ", "Sakkiz yuz ", "To'qqiz yuz "};
//
//        // if 'Y' is zero
//        if (n == 0) {
//            System.out.println("Zero");
//        }
//        // split 'Y' if it is more than 19
//        if (n >= 100 && n <= 999) {
//            System.out.println(Z[n / 100] + Y[n % 100 / 10] + X[n % 10]);
//        } else {
//            System.out.println("Iltimos 100 va 999 ralig'idagi sonni kiriting!");
//        }
//    }

    public static class case_18 {
        public static void main(String[] args) {
            Scanner fara = new Scanner(System.in);
            int a;
            System.out.println("(100<a<999) a=");
            a = fara.nextInt();

            int b = a / 100;//yuzlar
            switch (b) {
                case 0 -> System.out.print("yuz");
                case 1 -> System.out.print("biryuz ");
                case 2 -> System.out.print("ikki yuz ");
                case 3 -> System.out.print("uchyuz ");
                case 4 -> System.out.print("to'rt yuz ");
                case 5 -> System.out.print("Besh  yuz ");
                case 6 -> System.out.print("Olti yuz ");
                case 7 -> System.out.print("yetti yuz ");
                case 8 -> System.out.print("Sakkiz yuz ");
                case 9 -> System.out.print("to'qqiz yuz ");
            }
            int d = a % 100 / 10; //onlar
            switch (d) {
                case 1:
                    System.out.print("o'n");
                    break;
                case 2:
                    System.out.print("yigirma");
                    break;
                case 3:
                    System.out.print("o'ttiz");
                case 4:
                    System.out.print("qirq");
                    break;
                case 5:
                    System.out.print("ellik");
                    break;
                case 6:
                    System.out.print("oltmish");
                    break;
                case 7:
                    System.out.print("yetmish");
                    break;
                case 8:
                    System.out.print("sakson");
                    break;
                case 9:
                    System.out.print("to'qson");
                    break;
            }
            int c = a % 10;//birlar
            switch (c) {
                case 1:
                    System.out.print(" bir");
                    break;
                case 2:
                    System.out.print(" ikki");
                    break;
                case 3:
                    System.out.print(" uch");
                case 4:
                    System.out.print(" to'rt");
                    break;
                case 5:
                    System.out.print(" besh");
                    break;
                case 6:
                    System.out.print(" olti");
                    break;
                case 7:
                    System.out.print(" yetti");
                    break;
                case 8:
                    System.out.print(" sakkiz");
                    break;
                case 9:
                    System.out.print(" to'qqiz");
                    break;


            }
        }
    }
}


