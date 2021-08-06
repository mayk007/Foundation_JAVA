// Author: Bekhzod Mustafaev
// Sana: 03.08.2021
// Task: Kvadrat tomoni berilgan. Uning yuzasi aniqlasin. S=a*2

package Input_output.begin_2;

import java.util.Scanner;

public class begin_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        double S = Math.pow(a, 2);
        System.out.format("Tomonlari %d bo'lgan kvadrat yuzasi %.0f ga teng!", a,S);

    }
}
