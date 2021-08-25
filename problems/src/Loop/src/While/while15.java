package Loop.src.While;

import java.util.Scanner;

public class while15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Boshlang'ch summa S ni kiriting: ");
        double S = sc.nextInt();
        System.out.println("Soizni kiriting (0<p<12): ");
        double p = sc.nextInt();

        int k = 0;
        double foiz =0;
        double target = S * 2;
        double sum = S;
        int i = 0;

        while (sum<=target){

            foiz += (sum/100)*p;
            sum +=foiz;
            k++;
            System.out.println(k + "-oy ==> " + sum);
        }
        System.out.println(S + " sum "+ k + " oydan keyin " + sum + " sumga oshadi.");
        System.out.println("k = " + k);

    }
}
