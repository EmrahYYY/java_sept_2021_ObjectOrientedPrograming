package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        System.out.println("Hey, give me a number.");
//        int userNumber = userInput.nextInt();
//        System.out.println("Give me a second number.");
//        int secondNumber = userInput.nextInt();
//
//        int sum = userNumber + secondNumber;
//        System.out.println("The sum of your numbers is: " + sum);

        Random myRandom = new Random();
        int randomNumber = myRandom.nextInt(42) + 1;
        System.out.println(randomNumber);
        randomNumber = myRandom.nextInt(42) + 1;
        System.out.println(randomNumber);
        randomNumber = myRandom.nextInt(42) + 1;
        System.out.println(randomNumber);
        randomNumber = myRandom.nextInt(42) + 1;
        System.out.println(randomNumber);
        randomNumber = myRandom.nextInt(42) + 1;
        System.out.println(randomNumber);
        randomNumber = myRandom.nextInt(42) + 1;
        System.out.println(randomNumber);

    }
}
