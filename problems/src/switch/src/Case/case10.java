package Case;

import java.util.Scanner;

public class case10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yo'nalishni kiriting (s-shimol, j-janub, q-sharq, g-g'arb): ");
        char Y = sc.next().charAt(0);
        System.out.print("Komandani kiriting (0-harakatni davom ettir, 1-chapga buril, o'ngga buril): ");
        int K = sc.nextInt();

        switch (Y) {
            case 's' -> {
                System.out.println("Robot boshlangich holati: Shimol");
                if (K == 0) {
                    System.out.println("Robot yo'nalishi: Shimol");
                } else if (K == 1) {
                    System.out.println("Robot yo'nalishi: G'arb");
                } else if (K == 2) {
                    System.out.println("Robot yo'nalishi: Sharq");
                }else {
                    System.out.println("Bunday Komanda yo'q!");
                }
            }
            case 'j' -> {
                System.out.println("Robot boshlangich holati: Janub");
                if (K == 0) {
                    System.out.println("Robot yo'nalishi: Janub");
                } else if (K == 1) {
                    System.out.println("Robot yo'nalishi: Sharq");
                } else if (K == 2) {
                    System.out.println("Robot yo'nalishi: G'arb");
                } else {
                    System.out.println("Bunday Komanda yo'q!");
                }
            }
            case 'q' -> {
                System.out.println("Robot boshlangich holati: Sharq");
                if (K == 0) {
                    System.out.println("Robot yo'nalishi: Sharq");
                } else if (K == 1) {
                    System.out.println("Robot yo'nalishi: Shimol");
                } else if (K == 2) {
                    System.out.println("Robot yo'nalishi: Janub");
                } else {
                    System.out.println("Bunday Komanda yo'q!");
                }
            }
            case 'g' ->{
                System.out.println("Robot boshlangich holati: G'arb");
                if (K == 0){
                    System.out.println("Robot yo'nalishi: G'arb");
                } else if (K == 1){
                    System.out.println("Robot yo'nalishi: Janub");
                } else if (K == 2){
                    System.out.println("Robot yo'nalishi: Shimol");
                } else {
                    System.out.println("Bunday Komanda yo'q!");

                }
            }
            default -> System.out.println("Bunday yo'nalish mavjud emas!");
        }
    }
}

