package rvt;

import java.util.Scanner;

public class ReapeatingBreakAndRemembering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            String line = sc.nextLine();
            int n;
            try {
                n = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                continue;
            }

            if (n < 0) {
                break;
            }

            sum += n;
            count++;
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        double average = count > 0 ? (double) sum / count : 0.0;
        System.out.printf("Average: %.12f%n", average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
}