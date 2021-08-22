package Case;

import java.util.Scanner;

public class case17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n (10<=n<=40): ");
        int n = sc.nextInt();

//        final String empty = "";
//        final String[] X = {empty,  "Bir ", "Ikki ", "Uch ", "To'rt ", "Besh ", "Olti ",
//                            "Yetti ", "Sakkiz ", "To'qqiz "} ;
////        System.out.println(X[5]);
//
//        final String[] Y =  {
//                empty, "O'n ", "Yigirma ", "O'ttiz ", "Qirq ", "Ellik ",
//                "Oltmish ", "Yetmish ", "Sakson ", "To'qson "
//        };
//
//        // if 'Y' is zero
//        if (n == 0){
//            System.out.println("Zero");
//        }
//        // split 'Y' if it is more than 19
//        if (n >= 10 && n<=40){
//            System.out.println(Y[n/10] + X[n%10] + "ta masala");
//        } else {
//            System.out.println("Iltimos 20 va 60 ralig'idagi sonni kiriting!");
//        }

        // 2-usul
        int x = n / 10; // o'nlik
        int y = n % 10; // birlik

        switch (x) {
            case 1: {
                if (y==0){
                    System.out.println("O'n ta masala");
                } else if (y==1){
                    System.out.println("O'n bitta masala ");
                }else if (y==2){
                    System.out.println("O'n ikkita masala");
                }else if (y==3){
                    System.out.println("O'n uchta masala ");
                }else if (y==4){
                    System.out.println("O'n to'rtta masala");
                }else if (y==5){
                    System.out.println("O'n beshta masala");
                }else if (y==6){
                    System.out.println("O'n oltita masala");
                }else if (y==7){
                    System.out.println("O'n yettita masala");
                }else if (y==8){
                    System.out.println("YO'n sakkizta masala");
                }else if (y==9){
                    System.out.println("O'n to'qqizta masala ");
                }
            }break;
            case 2: {
                if (y==0){
                    System.out.println("Yigirmata masala");
                } else if (y==1){
                    System.out.println("Yigirma birta masala");
                }else if (y==2){
                    System.out.println("Yigirma ikkita masala");
                }else if (y==3){
                    System.out.println("Yigirma uchta masala");
                }else if (y==4){
                    System.out.println("Yigirma to'rtta masala");
                }else if (y==5){
                    System.out.println("Yigirma beshta masala");
                }else if (y==6){
                    System.out.println("Yigirma oltita masala");
                }else if (y==7){
                    System.out.println("Yigirma yettita masala");
                }else if (y==8){
                    System.out.println("Yigirma sakkizta masala");
                }else if (y==9){
                    System.out.println("Yigirma to'qqizta masala");
                }
            } break;
            case 3:{
                if (y==0){
                    System.out.println("O'ttizta masala");
                } else if (y==1){
                    System.out.println("O'ttiz birta masala");
                }else if (y==2){
                    System.out.println("O'ttiz ikkita masala");
                }else if (y==3){
                    System.out.println("O'ttiz uchta masala");
                }else if (y==4){
                    System.out.println("O'ttiz to'rtta masala");
                }else if (y==5){
                    System.out.println("O'ttiz beshta masala");
                }else if (y==6){
                    System.out.println("O'ttiz oltita masala");
                }else if (y==7){
                    System.out.println("O'ttiz yettita masala");
                }else if (y==8){
                    System.out.println("O'ttiz sakkizta masala");
                }else if (y==9) {
                    System.out.println("O'ttiz to'qqizta masala");
                }
            }break;
            case 4:{
                if (y==0){
                    System.out.println("Qirqta masala");
                }

            }default: System.out.println("Bunday masala yo'q"); break;
        }


    }
}
