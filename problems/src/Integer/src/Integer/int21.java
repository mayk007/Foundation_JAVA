package Integer;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class int21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sekund: ");
        int s = sc.nextInt();

        int min = s / 60;
        int sek = s % 60;

        System.out.printf("Kun boshidan boshlab %d minut va %d sekunt vaqt o'tdi.", min,sek);

    }
}
