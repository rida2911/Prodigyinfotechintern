// task 2 

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
       
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; 
        
    
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 0;   
        int attempts = 0;   
        
    
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100. Try to guess it!");

    
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;  

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly.");
                System.out.println("It took you " + attempts + " attempts to guess the number.");
            }
        }


        scanner.close();
    }
}
