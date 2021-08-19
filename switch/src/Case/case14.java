package Case;

import java.util.Scanner;

public class case14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, R1, R2, S;

        System.out.println("\n1-tomoni a, \n2-ichki chizilgan aylananing radiusi R1  = a*Math.sqrt\n3-Tashqi chizilgan aylananing radiusi R2 = 2*R1 \n4-yuzasi S=(a*a)*Math.sqrt(3/4");
        System.out.print("Yuqoridagi elementlardan birini kiriting: ");
        int A = sc.nextInt();
        System.out.print("Sonni kiriting: ");
        int n = sc.nextInt();

        switch (A) {
            case 1 -> {
                System.out.println("Teng tomonli uchburchak tomoni a = " + n + " kiritildi:");
                R1 = n * Math.sqrt(3) / 6;
                System.out.println("Ichki chizilgan aylananing radiusi = " + R1);
                R2 = 2 * R1;
                System.out.println("Tashqi chizilgan aylananing radiusi = " + R2);
                S = Math.pow(n, 2) * Math.sqrt(3) / 4;
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 2 -> {
                System.out.println("Ichki chizilgan aylananing radiusi R1 = " + n + " kiritildi:");
                a = n * 6 / Math.sqrt(3);
                System.out.println("tomoni = " + a);
                R2 = 2 * n;
                System.out.println("Tashqi chizilgan aylananing radiusi = " + R2);
                S = Math.pow(a, 2) * Math.sqrt(3) / 4;
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 3 -> {
                System.out.println("Tashqi chizilgan aylananing radiusi R2 = " + n + " kiritildi:");
                R1 =  n / 2;
                System.out.println("Ichki chizilgan aylananing radiusi = " + R1);
                a = 6 * n / Math.sqrt(3);
                System.out.println("tomoni = " + a);
                S = Math.pow(a, 2) * Math.sqrt(3) / 4;
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 4 -> {
                System.out.println("Yuza = " + n + " kiritildi:");
                a = Math.sqrt(4 * n / Math.sqrt(3));
                System.out.println("tomoni = " + a);
                R1 = a * Math.sqrt(3) / 6;
                System.out.println("Ichki chizilgan aylananing radiusi = " + R1);
                R2 = 2 * R1;
                System.out.println("Ichki chizilgan aylananing radiusi = " + R2);
            }
            default -> System.out.println("Bunday element yoq!");
        }
    }
}
