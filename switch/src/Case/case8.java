package Case;

import java.util.Scanner;

public class case8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D, M, Y;
        System.out.print("(D>=1 && D <= 31), D: ");
        D = sc.nextInt();
        System.out.print("(D>=1 && D <= 12), M: ");
        M = sc.nextInt();
        System.out.print("Kabissa bo'lmagan yilni kiriting: ");
        Y = sc.nextInt();

        int kabisa = 0;
        // kiritilgan yil Kabisa yilmi yoki yo'q aniqlab olamiz
        if (Y >= 1 && Y <= 99 && Y % 4 != 0) {
            kabisa += 1;
        } else if  (Y >= 100 && Y % 400 != 0){
            kabisa +=2;
        }


        switch (kabisa) {
            case 0 -> {
                System.out.println("Kiritilgan yil Kabisa yiliga to'g'ri keladi.\n" +
                        "Iltimos yilni qaytadan kiriting!");
            }
            case 1, 2 -> {
                switch (M) {
                    case 1 -> {
                        if (D >= 1 && D <= 31) {
                            System.out.println(D + "- Yanvar!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Yanvar oyida mavjud emas!");
                        }
                    }
                    case 2 -> {
                        if (D >= 1 && D <= 28) {
                            System.out.println(D + "- Fevral!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Fevral oyida mavjud emas!");
                        }
                    }
                    case 3 -> {
                        if (D >= 1 && D <= 31) {
                            System.out.println(D + "- Mart!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Mart oyida mavjud emas!");
                        }
                    }
                    case 4 -> {
                        if (D >= 1 && D <= 30) {
                            System.out.println(D + "- Aprel!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Aprel oyida mavjud emas!");
                        }
                    }
                    case 5 -> {
                        if (D >= 1 && D <= 31) {
                            System.out.println(++D + "- May!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun May oyida mavjud emas!");
                        }
                    }
                    case 6 -> {
                        if (D >= 1 && D <= 30) {
                            System.out.println(D + "- Iyun!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Iyun oyida mavjud emas!");
                        }
                    }
                    case 7 -> {
                        if (D >= 1 && D <= 31) {
                            System.out.println(D + "- Iyul!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Iyul oyida mavjud emas!");
                        }
                    }
                    case 8 -> {
                        if (D >= 1 && D <= 31) {
                            System.out.println(D + "- Avgust!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Avgust oyida mavjud emas!");
                        }
                    }
                    case 9 -> {
                        if (D >= 1 && D <= 30) {
                            System.out.println(D + "- Septabr!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Septabr oyida mavjud emas!");
                        }
                    }
                    case 10 -> {
                        if (D >= 1 && D <= 31) {
                            System.out.println(D + "- Oktabr!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Oktabr oyida mavjud emas!");
                        }
                    }
                    case 11 -> {
                        if (D >= 0 && D <= 29) {
                            System.out.println(++D + "- Noyabr!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Noyabr oyida mavjud emas!");
                        }
                    }
                    case 12 -> {
                        if (D >= 1 && D <= 31) {
                            System.out.println(D + "- Dekabr!");
                        } else {
                            System.out.println("Sana noto'gri kiritildi." + D + "- kun Dekabr oyida mavjud emas!");
                        }
                    }
                }
            }
        }
    }
}