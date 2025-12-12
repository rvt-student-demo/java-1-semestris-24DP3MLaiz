package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyTheseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Give numbers:");
        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == -1) {
                break;
            }
            numbers.add(n);
        }

        System.out.println("From where? ");
        int start = Integer.parseInt(sc.nextLine());

        System.out.println("To where? ");
        int end = Integer.parseInt(sc.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }

        sc.close();
    }
}