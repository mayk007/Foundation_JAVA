package Case;

import java.util.Scanner;

public class case5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A=");
        double A = sc.nextInt();
        System.out.print("B=");
        double B = sc.nextInt();
        System.out.println("Amalni kiriting: \n1-Qo'shish \n2-Ayirish \n3-bo'lish \n4-ko'paytirish ");
        System.out.print("(1>=amal<=4), amal= ");
        int amal = sc.nextInt();

        // enhanced switch operatori orqali bajarildi
        switch (amal) {
            case 1 -> System.out.print(A + "+" + B + "=" + (A + B));
            case 2 -> System.out.print(A + "-" + B + "=" + (A - B));
            case 3 -> System.out.print(A + "*" + B + "=" + (A * B));
            case 4 -> System.out.print(A + "/" + B + "=" + (A / B));
            default -> System.out.println("Bunday amal bizning dasturda mavjud emas!");
        }

    }
}
