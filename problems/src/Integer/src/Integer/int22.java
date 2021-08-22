package Integer;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class int22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sekund: ");
        int s = sc.nextInt();

        int h = s / 3600;
        int sek = s % 3600;

        System.out.printf("Kun boshidan boshlab %d soat va %d sekunt vaqt o'tdi.", h,sek);

    }
}
