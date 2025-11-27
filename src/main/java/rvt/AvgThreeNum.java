package rvt;
import java.util.Scanner;

public class AvgThreeNum {
    int num1;
    int num2;
    int num3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextLine());

        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("The average is: " + average);
    }
}
