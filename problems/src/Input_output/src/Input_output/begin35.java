package Input_output;

import java.util.Scanner;

public class begin35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qayiqning tezligi V(km/soat) (V>U): ");
        double V = sc.nextDouble();
        System.out.print("Daryo oqimining tezligi U(km/soat): ");
        double U = sc.nextDouble();
        System.out.print("Qayiqning daryo oqimi bo'yicha harakatlanish vaqti: ");
        double T1 = sc.nextDouble();
        System.out.print("Qayiqning daryo oqimiga qarshi harakatlanish vaqti: ");
        double T2 = sc.nextDouble();

        // Daryo oqimi bo'yicha yurilgan yo'l
        double S1 = T1 * (V + U);
        // Daryo oqimiga qarshi yurilgan yo'l
        double S2 = T2 * (V - U);
        // Qayiqning umumiy  yurgan yo'li
        double S = S1 + S2;

        System.out.println("\nQayiqning Daryo oqimi bo'yicha yurgan yo'li " + S1);
        System.out.println("Qayiqning Daryo oqimiga qarshi yurgan yo'li " + S2);
        System.out.println("Qayiqning yurgan umumiy yo'li " + S);


    }
}
