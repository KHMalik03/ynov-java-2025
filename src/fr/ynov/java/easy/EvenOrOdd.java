package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt() % 2;

        if (num == 0) {
            System.out.println("The number is even");
        }

        System.out.println("The number is odd");
    }
}
