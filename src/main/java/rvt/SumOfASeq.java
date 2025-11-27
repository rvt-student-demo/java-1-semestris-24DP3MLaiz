package rvt;

import java.util.Scanner;

public class SumOfASeq {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi skaitli:");
        int n = Integer.valueOf(sc.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Last number? " + n);
        System.out.println("The sum is " + sum);
        sc.close();
    }
}