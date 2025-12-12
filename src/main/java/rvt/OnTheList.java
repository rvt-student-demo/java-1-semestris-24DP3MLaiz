package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Give names:");
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            names.add(line);
        }

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        System.out.print("Search for? ");
        String search = sc.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

        sc.close();
    }
}