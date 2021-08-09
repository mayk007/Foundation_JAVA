package Integer;

import javax.naming.directory.SchemaViolationException;
import java.util.Scanner;

public class int16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A= ");
        int A = sc.nextInt();

        int yuz, on, bir, natija;
        yuz = A / 100;
        on = (A % 100) / 10;
        bir = A % 10;

        natija = yuz * 100 + bir * 10 + on;

        System.out.printf("O'nliklar va birlilar xonasidagi raqamlarni almashtirishdan hosil bo'lgan son: %d", natija);


    }
}
