package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Enter an operator: ");
        String operator = sc.next();

        System.out.println("Enter another number: ");
        int b = sc.nextInt();



        switch (operator) {
            case "+":
                System.out.println(add(a, b));
                break;
            case "-":
                System.out.println(subtract(a, b));
                break;
            case "*":
                System.out.println(multiply(a, b));
                break;
            case "/":
                System.out.println(divide(a, b));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }
}
