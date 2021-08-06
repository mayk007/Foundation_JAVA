package Input_output;

import java.util.Scanner;

public class begin37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1-avtomobil tezligi V1(km/soat): ");
        double V1 = sc.nextDouble();
        System.out.print("2-avtomobil tezligi V2(km/soat): ");
        double V2 = sc.nextDouble();
        System.out.print("Avtomobillar orasida boshlang'ich masofa (km): ");
        double S = sc.nextDouble();
        System.out.print("avtomobillar bir biriga qarama qarshi yurgandagi vaqt T(km/soat): ");
        double T = sc.nextDouble();

        // Avtomobillar bir-biriga teskari tomonga harakatlangandagi masofa
        double S1 = S - (T * (V1 + V2)) ;

        if (S1<=0){
            System.out.println("\nAvtomobollar bir-biri bilan to'qnashdi! CRASH!!!");
        } else {
            System.out.println("\nAvtomobillar bir-biri  tomonga harakatlanganda " + T +" soatdan keyin ular orasidagi masofa " + S1 + " km.");
        }

    }
}
