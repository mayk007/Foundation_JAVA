// Author: Bekhzod Mustafaev
// Sana: 03.08.2021
// Task: Begin6


package Input_output.begin_6;

import java.util.Scanner;

public class begin6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a, b, c butun sonlarni kiriting: ");
        int a = sc.nextInt();

        int b = sc.nextInt();
        int c = sc.nextInt();

        int V = a * b * c;
        int S = 2 * ( a * b + b * c + a * c);

        System.out.println("V=" + V + "\nS=" + S );



    }

}