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
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.JANUARY, 1);
        Date birthDate = cal.getTime();

        Person test = new Person("John Doe", "Male", 180.5f, 75.0f, Nationality.AMERICAN, birthDate);
        test.display();
    }

    private final String name;
    private final String gender;
    private final float height;
    private final float weight;
    private final Nationality nationality;
    private final Date birthday;

    public Person(String name, String gender, float height, float weight, Nationality nationality, Date birthday) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
        this.birthday = birthday; // Fixed: Use the parameter instead of new Date()
    }

    public int calculateAge() {
        Date now = new Date();
        long diff = now.getTime() - birthday.getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365.25));
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + calculateAge());
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Nationality: " + nationality);
    }
}