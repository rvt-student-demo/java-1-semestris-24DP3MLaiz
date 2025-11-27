package rvt;

import java.util.Scanner;

public class Detalas {
    double skruves;
    double uzgriezni;
    double paplaksnes;
    double kopsumma;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skrūvju daudzums:");
        double skruves = Double.valueOf(sc.nextLine());

        System.out.println("Uzgriežņu daudzums:");
        double uzgriezni = Double.valueOf(sc.nextLine());

        System.out.println("Paplāksnīšu daudzums:");
        double paplaksnes = Double.valueOf(sc.nextLine());

        double kopsumma = (skruves * 5) + (uzgriezni * 3) + (paplaksnes * 1);

        System.out.println("Kopējā cena: " + kopsumma);
    }
}
