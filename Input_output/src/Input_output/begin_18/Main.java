// Author: Bekhzod Mustafaev
// Sana: 03.08.2021


package Input_output.begin_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        final double Pi = 3.14;
        System.out.println("(A<C<B)\nA= \nB= \nC=");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        double AC = Math.abs(A-C);
        double BC = Math.abs(B-C);
        double K = AC * BC;
        System.out.println("AC=" + AC + "\nBC=" + BC + "\nK="+ K);

    }
}