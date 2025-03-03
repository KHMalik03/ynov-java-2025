package fr.ynov.java.easy;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    private static List<Integer> numbers;

    public static void main(String[] args) {
        createAndPopulateArray();
        printArrayWithForEach(numbers);
    }

    public static void createAndPopulateArray(){
        numbers = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void printArrayWithFor(List<Integer> a){
        for (int i=1; i<a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public static void printArrayWithForEach(List<Integer> a){
        for (Integer  number: a) {
            System.out.println(number);
        }
    }
}
