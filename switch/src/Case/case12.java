package Case;

import java.util.Scanner;

public class case12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R, D, L, S, Pi = Math.PI;

        System.out.print("\n1-radius R, \n2-diametr D= 2*R \n3-uzunligi L = 2 * Pi * R \n4-yuzasi S=Pi*R*R");
        System.out.print("Yuqoridagi elementlardan birini kiriting: ");
        int A = sc.nextInt();
        System.out.print("Sonni kiriting: ");
        double n = sc.nextDouble();

        switch (A) {
            case 1 -> {
                System.out.println("Doiraning radiusi R = " + n + " kiritildi:");
                D = 2 * n;
                System.out.println("Doira diametri = " + D);
                L = 2 * Pi * n;
                System.out.println("Doira Uzunligi = " + L);
                S = Pi * Math.pow(n, 2);
                System.out.println("Doira yuzasi = " + S);
            }
            case 2 -> {
                System.out.println("Doiraning diametri D = " + n + " kiritildi:");
                R = n / 2;
                System.out.println("Doira radiusi = " + R);
                L = 2 * Pi * R;
                System.out.println("Doira Uzunligi = " + L);
                S = Pi * Math.pow(R, 2);
                System.out.println("Doira yuzasi = " + S);
            }
            case 3 -> {
                System.out.println("Doiraning uzunligi L = " + n + " kiritildi:");
                R = n / (2 * Pi);
                System.out.println("Doira radiusi = " + R);
                D = 2 * R;
                System.out.println("Doira Diametri = " + D);
                S = Pi * Math.pow(R, 2);
                System.out.println("Doira yuzasi = " + S);
            }
            case 4 -> {
                System.out.println("Doiraning yuzasi S = " + n + " kiritildi:");
                R = n / Pi;
                R = Math.sqrt(R);
                System.out.println("Doira radiusi = " + R);
                L = 2 * Pi * R;
                System.out.println("Doira Diametri = " + L);
                S = Pi * Math.pow(R, 2);
                System.out.println("Doira uzunligi = " + S);
            }
            default -> System.out.println("Bunday element yoq!");
        }
    }
}
