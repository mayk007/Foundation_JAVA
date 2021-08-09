package Integer;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class int20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sekund: ");
        int s = sc.nextInt();

        int h = s / 3600;

        System.out.printf("Kun boshidan boshlab to'la %d soat vaqt o'tdi.", h);

    }
}
