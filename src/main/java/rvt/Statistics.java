package rvt;

import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0.0;
        }
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {
    Statistics statistics = new Statistics();
    statistics.addNumber(3);
    statistics.addNumber(5);
    statistics.addNumber(1);
    statistics.addNumber(2);
    System.out.println("Count: " + statistics.getCount());
    System.out.println("Sum: " + statistics.sum());
    System.out.println("Average: " + statistics.average());

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numbers:");
    Statistics total = new Statistics();
    Statistics even = new Statistics();
    Statistics odd = new Statistics();

    while (true) {
        int number = scanner.nextInt();
        if (number == -1) {
            break;
        }
        total.addNumber(number);
        if (number % 2 == 0) {
            even.addNumber(number);
        } else {
            odd.addNumber(number);
        }
    }

    scanner.close();

    System.out.println("Sum: " + total.sum());
    System.out.println("Sum of even numbers: " + even.sum());
    System.out.println("Sum of odd numbers: " + odd.sum());
}
}