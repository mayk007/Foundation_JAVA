package Integer;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class int23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sekund: ");
        int s = sc.nextInt();

        int h = s / 3600;
        int min = (s % 3600) / 60;
        int sek = (s % 3600) % 60;

        System.out.printf("Kun boshidan boshlab %d soat %d minut va %d sekunt vaqt o'tdi.", h, min,sek);

    }
}
