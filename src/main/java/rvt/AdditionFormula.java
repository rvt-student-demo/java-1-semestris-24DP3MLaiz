package rvt;

import java.util.Scanner;

public class AdditionFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Input the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        int result = a + b;
        System.out.println();
        System.out.println(a + "+" + b + "=" + result);
    }
}
