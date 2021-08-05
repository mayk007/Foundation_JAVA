// Author: Bekhzod Mustafaev
// Sana: 03.08.2021
// Task: Begin67

package Input_output.begin_7;

import java.util.Scanner;

public class begin7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Pi = 3.14;
        System.out.println("R= ");
        int R = sc.nextInt();

        double L = 2 * Pi * R;
        double S = Pi * Math.pow(R,2);

        System.out.println("L=" + L + "\nS=" + S );



    }

}