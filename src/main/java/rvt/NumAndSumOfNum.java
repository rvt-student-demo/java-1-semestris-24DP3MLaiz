package rvt;

import java.util.Scanner;

public class NumAndSumOfNum {
    public static void main(String[] args) {
        int numberCount = 0;
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            n = Integer.valueOf(sc.nextLine());
            if (n != 0) {
                numberCount = numberCount + 1;
                sum = sum + n;
            } else {
                break;
        }
    }
    System.out.println("Number of numbers: " + numberCount);
    System.out.println("Sum of the numbers: " + sum);
    sc.close();
    }
}