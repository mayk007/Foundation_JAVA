package Case;

import java.util.Scanner;

public class case14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, R1, R2, S;

        System.out.println("\n1-tomoni a, \n2-ichki chizilgan aylananing radiusi R1  = a*Math.sqrt\n3-Tashqi chizilgan aylananing radiusi R2 = 2*R1 \n4-yuzasi S=(a*a)*Math.sqrt(3/4");
        System.out.println("Yuqoridagi elementlardan birini kiriting: ");
        int A = sc.nextInt();

        switch (A) {
            case 1 -> {
                System.out.println("Teng tomonli uchburchak tomoni a = " + A + " kiritildi:");
                R1 = A * Math.sqrt(3/6);
                System.out.println("Ichki chizilgan aylananing radiusi = " + R1);
                R2 = 2*R1;
                System.out.println("Tashqi chizilgan aylananing radiusi = " + R2);
                S = Math.pow(A,2)*Math.sqrt(3/4);
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 2 -> {
                System.out.println("Ichki chizilgan aylananing radiusi R1 = " + A + " kiritildi:");
                a = A / Math.sqrt(3/6);
                System.out.println("tomoni = " + a);
                R2 = 2*A;
                System.out.println("Tashqi chizilgan aylananing radiusi = " + R2);
                S = Math.pow(a,2)*Math.sqrt(3/4);
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 3 ->{
                System.out.println("Ichki chizilgan aylananing radiusi R1 = " + A + " kiritildi:");
                a = A / Math.sqrt(3/6);
                System.out.println("tomoni = " + a);
                R2 = 2*A;
                System.out.println("Tashqi chizilgan aylananing radiusi = " + R2);
                S = Math.pow(a,2)*Math.sqrt(3/4);
                System.out.println("Uchburchak yuzasi = " + S);
            }
            case 4 ->{
                System.out.println("Uchburchakning  yuzasi S = " + A + " kiritildi:");
                a = c/Math.sqrt(2);
                System.out.println("Katetlar = " + a);
                c = A * 2;
                System.out.println("gipotenuzasi = " + c);
                S = (c*A)/(2);
                System.out.println("Balandlik = " + S);
            }
            default -> System.out.println("Bunday element yoq!");
        }
    }
}
