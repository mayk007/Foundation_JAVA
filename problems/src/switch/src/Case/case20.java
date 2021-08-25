package Case;

import java.util.Scanner;

public class case20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D, M;
        System.out.print("(D>=1 && D <= 31), D: ");
        D = sc.nextInt();
        System.out.print("(M>=1 && M <= 12), M: ");
        M = sc.nextInt();

        switch (M) {
            case 1 -> {
                if (D >= 1 && D <= 31) {
                    System.out.println(D + "- Yanvar!");
                } if (D>1 && D<=19) {
                    System.out.println("Echki burji!");
                }else if (D >=20 && D<=31) {
                    System.out.println("Qovg'a burji!");
                }
            }
            case 2 -> {
                if (D >= 1 && D <= 28) {
                    System.out.println(D + "- Fevral!");
                }
                if (D >=1 && D<=18) {
                    System.out.println("Qovg'a burji!");
                }else if (D>18 && D<=28){
                    System.out.println("Baliq burji!");
                }
            }
            case 3 -> {
                if (D >= 1 && D <= 31) {
                    System.out.println(D + "- Mart!");
                } if (D >= 1 && D <= 20) {
                    System.out.println("Baliq burji!");
                } else if (D>20 && D<=31){
                    System.out.println("Qo'y burji!");
                }
            }
            case 4 -> {
                if (D >= 1 && D <= 30) {
                    System.out.println(D + "- Aprel!");
                }  if (D >= 1 && D <= 19) {
                    System.out.println("Qo'y burji");
                } else if (D>=20 && D<=30){
                    System.out.println("Buzoq burji!");
                }
            }
            case 5 -> {
                if (D >= 1 && D <= 31) {
                    System.out.println(++D + "- May!");
                }  if (D >= 1 && D <= 20) {
                    System.out.println("Buzoq burji!");
                } else if (D>20 && D<=31){
                    System.out.println("Egizaklar burji!");
                }
            }
            case 6 -> {
                if (D >= 1 && D <= 30) {
                    System.out.println(D + "- Iyun!");
                }  if (D >= 1 && D <= 21) {
                    System.out.println("Egizaklar burji!");
                } else if (D>21 && D<=30){
                    System.out.println("Qisqishbaqa burji!");
                }
            }
            case 7 -> {
                if (D >= 1 && D <= 31) {
                    System.out.println(D + "- Iyul!");
                }  if (D >= 1 && D <= 22) {
                    System.out.println("Qisqishbaqa burji!");
                } else if (D>22 && D<=31){
                    System.out.println("Arslon burji!");
                }
            }
            case 8 -> {
                if (D >= 1 && D <= 31) {
                    System.out.println(D + "- Avgust!");
                }  if (D >= 1 && D <= 22) {
                    System.out.println("Arslon burji!");
                } else if (D>22 && D<=31){
                    System.out.println("Parizod burji!");
                }
            }
            case 9 -> {
                if (D >= 1 && D <= 30) {
                    System.out.println(D + "- Septabr!");
                }  if (D >= 1 && D <= 22) {
                    System.out.println("Parizod burji!");
                } else if (D>22 && D<=30){
                    System.out.println("Tarozi burji!");
                }
            }
            case 10 -> {
                if (D >= 1 && D <= 31) {
                    System.out.println(D + "- Oktabr!");
                }  if (D >= 1 && D <= 22) {
                    System.out.println("Tarozi burji!");
                } else if (D>22 && D<=31){
                    System.out.println("Chayon burji!");
                }
            }
            case 11 -> {
                if (D >= 0 && D <= 30) {
                    System.out.println(++D + "- Noyabr!");
                }  if (D >= 1 && D <= 22) {
                    System.out.println("Chayon burji!");
                } else if (D>22 && D<=30){
                    System.out.println("O'qotar burji!");
                }
            }
            case 12 -> {
                if (D >= 1 && D <= 31) {
                    System.out.println(D + "- Dekabr!");
                }  if (D >= 1 && D <= 21) {
                    System.out.println("O'qotar  burji!");
                } else if (D>21 && D<=31){
                    System.out.println("Echki burji!");
                }
            }
        }
    }
}