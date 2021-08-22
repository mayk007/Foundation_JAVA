package Case;

import java.util.Scanner;

public class case13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, c, h, S;

        System.out.println("\n1-katet a, \n2-giputenuza c = a*Math.sqrt(2 )\n3-balandlik h = c/2 \n4-yuzasi S=(c*h)/2");
        System.out.print("Yuqoridagi elementlardan birini kiriting: ");
        int A = sc.nextInt();
        System.out.print("Sonni kiriting: ");
        double n = sc.nextDouble();

        switch (A) {
            case 1 -> {
                System.out.println("Teng yonli uchburchak katetlari a = " + n + " kiritildi:");
                c = n * Math.sqrt(2);
                System.out.println("gipotenuza = " + c);
                h = c / 2;
                System.out.println("Balandlik = " + c);
                S = (c * h) / (2);
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 2 -> {
                System.out.println("Teng yonli uchburchak gipotenuzasi c = " + n + " kiritildi:");
                a = n / Math.sqrt(2);
                System.out.println("Katetlar = " + a);
                h = n / 2;
                System.out.println("Balandlik = " + h);
                S = (n * h) / (2);
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 3 -> {
                System.out.println("Teng yonli uchburchak balandligi h = " + n + " kiritildi:");
                c = n * 2;
                System.out.println("gipotenuzasi = " + c);
                a = c / Math.sqrt(2);
                System.out.println("Katetlar = " + a);
                S = (c * n) / (2);
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 4 -> {
                System.out.println("Uchburchakning  yuzasi S = " + n + " kiritildi:");
                h = Math.sqrt(n);
                System.out.println("Balandlik = " + h);
                c = 2 * h;
                System.out.println("gipotenuzasi = " + c);
                a = c / Math.sqrt(2);
                System.out.println("Balandlik = " + a);
            }
            default -> System.out.println("Bunday element yoq!");
        }
    }
}
