package fr.ynov.java.medium;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

enum Nationality {
    FRENCH,
    ENGLISH,
    AMERICAN,
    GERMAN,
    ITALIAN,
    SPANISH,
    CHINESE,
    JAPANESE,
    KOREAN,
    RUSSIAN
};

public class Person {
    public static void main(String[] args) {

    }

    private final String name;
    private final String gender;
    private final float height;
    private final float weight;
    private final Nationality nationality;
    private final int age;

    public Person(String name, String gender, float height, float weight, Nationality nationality, int age) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
        this.age = age;
    }



    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age );
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Nationality: " + nationality);
    }
}