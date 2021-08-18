package Case;

import java.util.Scanner;

public class case11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lakatrning boshlang'ich holatini kiriting: (s-shimol, j-janub, q-sharq, g-g'arb): ");
        char C = sc.next().charAt(0);
        System.out.print("1- Komandani kiriting (0-harakatni davom ettir, 1-chapga buril, o'ngga buril): ");
        int K1 = sc.nextInt();
        System.out.print("2- Komandani kiriting (0-harakatni davom ettir, 1-chapga buril, o'ngga buril): ");
        int K2 = sc.nextInt();

        switch (K1) {
            case 0 -> {
                if (C == 's'){
                    System.out.println("Lakatr Boshlang'ich holati: Shimol");
                    System.out.println("1-kamandadan keyingi holat: Sharq");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'j'){
                    System.out.println("Lakatr Boshlang'ich holati: Janub");
                    System.out.println("1-kamandadan keyingi holat: G'arb");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'q'){
                    System.out.println("Lakatr Boshlang'ich holati: Sharq");
                    System.out.println("1-kamandadan keyingi holat: Janub");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'g'){
                    System.out.println("Lakatr Boshlang'ich holati: G'arb");
                    System.out.println("1-kamandadan keyingi holat: Shimol");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
            }
            case 1 -> {
                if (C == 's'){
                    System.out.println("Lakatr Boshlang'ich holati: Shimol");
                    System.out.println("1-kamandadan keyingi holat: G'arb");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'j'){
                    System.out.println("Lakatr Boshlang'ich holati: Janub");
                    System.out.println("1-kamandadan keyingi holat: Sharq");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'q'){
                    System.out.println("Lakatr Boshlang'ich holati: Sharq");
                    System.out.println("1-kamandadan keyingi holat: Shimol");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'g'){
                    System.out.println("Lakatr Boshlang'ich holati: G'arb");
                    System.out.println("1-kamandadan keyingi holat: Janub");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
            }
            case 2 -> {
                if (C == 's'){
                    System.out.println("Lakatr Boshlang'ich holati: Shimol");
                    System.out.println("1-kamandadan keyingi holat: Janub");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'j'){
                    System.out.println("Lakatr Boshlang'ich holati: Janub");
                    System.out.println("1-kamandadan keyingi holat: Shimol");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'q'){
                    System.out.println("Lakatr Boshlang'ich holati: Sharq");
                    System.out.println("1-kamandadan keyingi holat: G'arb");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: Sharq");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
                if (C == 'g'){
                    System.out.println("Lakatr Boshlang'ich holati: G'arb");
                    System.out.println("1-kamandadan keyingi holat: Sharq");
                    if (K2 == 0){
                        System.out.println("2-kamandadan keyingi holat: Janub");
                    } else if (K2 == 1){
                        System.out.println("2-kamandadan keyingi holat: Shimol");
                    } else if (K2 == 2){
                        System.out.println("2-kamandadan keyingi holat: G'arb");
                    } else {
                        System.out.println("Bunday kamanda yo'q!");
                    }
                }
            }
            default -> System.out.println("Bunday komanda yo'q");
        }
    }
}

