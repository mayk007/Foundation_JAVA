// Author: Bekhzod Mustafaev
// Sana: 05.08.2021


package Input_output.begin_21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a(x1,y1 = ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("b(x2,y2 = ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.print("c(x3,y3 = ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // Uchburchak tomonlari uzunligi
        double a = Math.sqrt(Math.abs(Math.pow((x2 - x1), 2)) + Math.abs(Math.pow((y2 - y1), 2)));
        double b = Math.sqrt(Math.abs(Math.pow((x3 - x1), 2)) + Math.abs(Math.pow((y3 - y1), 2)));
        double c = Math.sqrt(Math.abs(Math.pow((x3 - x2), 2)) + Math.abs(Math.pow((y3 - y2), 2)));

        // Uchburchakning Perimetri
        double p = (a + b + c) / 2;

        // Uchburchak yuzi
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("p=" + p + "\nS=" + S);

    }
}
