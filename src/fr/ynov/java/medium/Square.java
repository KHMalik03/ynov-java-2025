package fr.ynov.java.medium;


import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a number");
        int num = sc.nextInt();

        System.out.println("The square of " + num + " is " + square(num));


    }

    public static int square(int num) {

        return num * num;
    }
}
