package ru.mirea.practick5.task12;
import java.util.Scanner;

public class Main {
    public static void recursion() {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();

       if(n > 0) {
           if (n % 2 != 0) {
               System.out.println(n);
               recursion();
           } else
               recursion();
       }
    }

    public static void main(String[] args) {
        recursion();
    }
}
