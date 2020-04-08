import java.util.Scanner;



public class NumberGame {

    public static void main(String[] args){

// randomNumber creates a random integer from 1 to 100.
        int randomNumber = (int) (Math.random() * 100) +1;
        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it.");
        System.out.println(randomNumber);


    }



}
