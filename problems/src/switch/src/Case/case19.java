package Case;

import java.util.Scanner;

public class case19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yilni  kiriting (Y>1984): ");
        int Y = sc.nextInt();

        int Rang = (Y - 1984) % 5;
        int Muchal = (Y -1984) % 12;

        String S = "";

        switch (Rang){
            case 0: S += "Yashil- "; break;
            case 1: S += "Qizil- "; break;
            case 2: S += "Sariq- "; break;
            case 3: S += "Oq- "; break;
            case 4: S += "Qora- "; break;

        }
        switch (Muchal){
            case 0:System.out.println(S += "Sichqon!"); break;
            case 1:System.out.println(S += "Sigir!"); break;
            case 2:System.out.println(S += "Yo'lbars!"); break;
            case 3:System.out.println(S += "Quyon!"); break;
            case 4:System.out.println(S += "Ajdar!"); break;
            case 5:System.out.println(S += "Ilon!"); break;
            case 6:System.out.println(S += "Ot!"); break;
            case 7:System.out.println(S += "Qo'y!"); break;
            case 8:System.out.println(S += "Maymun!"); break;
            case 9:System.out.println(S += "Tovuq!"); break;
            case 10:System.out.println(S += "It!"); break;
            case 11:System.out.println(S += "To'ng'iz!"); break;

            default: System.out.println("Yilni to'gri kiriting!");
        }
    }
}
