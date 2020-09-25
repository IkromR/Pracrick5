package ru.mirea.practick5.task13;
import java.util.Scanner;

public class Main {
    public static void recursion(int i) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n != 0) {
            if (i % 2 == 1) {
                System.out.println(n);
            }
            recursion(i + 1);
        }
        return;
    }

    public static void main(String[] args) {
       recursion(1);
    }
}
