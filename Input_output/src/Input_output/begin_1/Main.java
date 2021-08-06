// Author: Bekhzod Mustafaev
// Sana: 03.08.2021
// Task: Kvadrat tomoni berilgan. Uning Perimetri aniqlasin. P + 4 * a

package Input_output.begin_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kiritish = new Scanner(System.in);

        System.out.print("a = ");
        int a = kiritish.nextInt();

        int P = 4 * a;
        System.out.format("Tomonlari %dcm bo'lgan kvadrat Perimetri %dcm ga teng!", a,P);

    }
}
