package Input_output;

import java.util.Scanner;

public class begin36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1-avtomobil tezligi V1(km/soat): ");
        double V1 = sc.nextDouble();
        System.out.print("2-avtomobil tezligi V2(km/soat): ");
        double V2 = sc.nextDouble();
        System.out.print("Avtomobillar orasida boshlang'ich masofa (metr): ");
        double S0 = sc.nextDouble();
        System.out.print("avtomobillar bir biridan uzoqlashgandagi vaqt T(km/soat): ");
        double T = sc.nextDouble();

        // Avtomobillar bir-biriga teskari tomonga harakatlangandagi masofa
        double S = T * (V1 + V2) + (S0/1000);

        System.out.println("\nAvtomobillar bir-biriga teskari tomonga harakatlanganda " + T +" soatdan keyin ular orasidagi masofa " + S + " km.");

    }
}
