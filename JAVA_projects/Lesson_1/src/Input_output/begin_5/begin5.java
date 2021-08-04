// Author: Bekhzod Mustafaev
// Sana: 03.08.2021
// Task: Kubning yon tomoni a berilgan.Uning hajmini V = pow(a,3) va to'la sirti S = 6*a*a aniqlansin.


package Input_output.begin_5;

import java.util.Scanner;

public class begin5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("a= ");
        double a = sc.nextDouble();

        double V = Math.pow(a, 3);
        double S = Math.pow(6, 2);

        System.out.format("Kubning Hajmi: %.2f \nKubning Sirti: %.2f", V, S);



    }
}