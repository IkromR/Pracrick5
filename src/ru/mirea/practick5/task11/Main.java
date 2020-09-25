package ru.mirea.practick5.task11;

import java.util.Scanner;

public class Main {
    public static void recursion(int lastN, int counter) {
        Scanner in = new Scanner(System.in);
        int newN = in.nextInt();
        if (lastN == newN && lastN == 0) {
            System.out.println(counter);
        } else {
            if (newN == 1) {
                ++counter;
            }
            recursion(newN, counter);
        }
    }

    public static void main(String[] args) {
        recursion(-1, 0);
    }
}
