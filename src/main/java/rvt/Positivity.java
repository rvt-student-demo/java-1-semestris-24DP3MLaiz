package rvt;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int n = Integer.valueOf(scanner.nextLine());
        if (n > 0) {
            System.out.println("Number " + n + " is positive.");
        } else {
            System.out.println("Number " + n + " is negative.");
        }
        scanner.close();
    }
}

