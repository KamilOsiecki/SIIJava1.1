package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chancesLeft = 5;
        System.out.println("Try to guess a randomly drawn integer between 0-99. You have" + chancesLeft + " chances. Let's start ;) ");
        int numberToGuess = new Random().nextInt(100);

        for (int i = 0; i < 5; i++) {
            chancesLeft--;
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (number < 0 || number > 99) {
                System.out.println("The number entered is out of range. Please try again. Chances left: " + chancesLeft);

            } else if (number == numberToGuess) {
                System.out.println("You guessed it!");
                break;

            } else {
                if ((number > numberToGuess)) {
                    if (chancesLeft > 0) {
                        System.out.println("Your number is GREATER than the one you are trying to guess\n" +
                                "Please try again. Chances left: " + chancesLeft);
                        continue;
                    }
                } else {
                    if (chancesLeft > 0) {
                        System.out.println("Your number is LOWER than the one you are trying to guess\n" +
                                "Please try again. Chances left: " + chancesLeft);
                        continue;
                    }
                }
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            }
        }
    }
}