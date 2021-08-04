// Author: Bekhzod Mustafaev
// Sana: 03.08.2021
// Task: Aylananing diametri d berilgan. Uning uzunligi aniqlansin L = 3.14*d

// define a package
package Input_output.begin_4;

// necessary libraries
import java.util.Scanner;

// define a class
public class begin4 {
    //define a Main method
    public static void main(String[] args){
        // it allows to receive an input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Aylananing diametri(butun son) d ni kiriting: ");
        int d = sc.nextInt();

        float L = 3.14f * d;

        System.out.format("Aylanaing uzunligi %.2f ga teng!", L);
        System.out.println("\nAylanaing uzunligi " + L + " ga teng!");




    }
}