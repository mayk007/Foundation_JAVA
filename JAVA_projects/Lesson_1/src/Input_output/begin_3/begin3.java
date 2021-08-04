// Author: Bekhzod Mustafaev
// Sana: 03.08.2021
// Task: To'g'ri to'rtburchakning tomonlari a va b berilgan. Uning yuzasi "S=a*b; va P=2(a+b)" perimetri aniqlansin.

// define packages
package Input_output.begin_3;

// import necessary libraries
import java.util.Scanner;

// create a class with appropriate name
public class begin3 {

    // define a Main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // prints the output
        System.out.println("a va b butun sonlarni kiriting:");

        // asks an input from the user
        int a = sc.nextInt();
        int b = sc.nextInt();

        // To'rtburchak yuzasi
        int S = a * b;

        // To'rtburchak Perimetri
        int P = 2*(a+b);

        System.out.println("To'rtburchak yuzasi:" + S + "\nTo'rtburchak Perimetri: " + P);

    }
}

