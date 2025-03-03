package fr.ynov.java.easy;

public class Loops {
    public static void main(String[] args) {
        //forLoop();
        //whileLoop();
        //doWhileLoop();
    }

    //for loop count from 1 to 10
    public static void forLoop(){
        for (int i =1; i <=10 ; i++){
            System.out.println(i);
        }
    }

    //while loop count from 1 to 10
    public static void whileLoop(){
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    //dowhile loop count from 1 to 10

    public static void doWhileLoop(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<=10);
    }

}
