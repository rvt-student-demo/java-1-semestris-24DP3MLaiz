package rvt;

import java.util.Scanner;

public class Delikatese {
    String prece;
    double cena;
    double piegade;
    double kopa;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi preci:");
        String prece = sc.nextLine();

        System.out.println("Ievadi cenu:");
        double cena = Double.valueOf(sc.nextLine());

        System.out.println("Ekspress piegāde (0==nē, 1==jā): ");
        int jautajums;
        try {
            jautajums = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nederīga ievade. Lūdzu, ievadiet 0 vai 1.");
            return;
        }

        double piegade;
        if (jautajums == 1) {
            piegade = 5.00;
        } else {
            piegade = 0.00;
        }

        double kopa = cena + piegade;
        
        System.out.println();
        System.out.println("Rēķins:");
        System.out.println("    " + prece + "   " + cena );
        System.out.println("    piegāde " + "   " + piegade);
        System.out.println("    kopā " + "  " + kopa);
    }
}