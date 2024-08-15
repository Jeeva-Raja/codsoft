//Generate a random number within a specified range, such as 1 to 100.
//Prompt the user to enter their guess for the generated number.
//Compare the user's guess with the generated number and provide feedback on whether the guessis correct, too high, or too low.
//Repeat steps 2 and 3 until the user guesses the correct number.
//You can incorporate additional details as follows:
//Limit the number of attempts the user has to guess the number.
//Add the option for multiple rounds, allowing the user to play again.
//Display the user's score, which can be based on the number of attempts taken or rounds won.

import java.util.Random;
import java.util.Scanner;

public class Numbergame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int  randomnumber = random.nextInt(100) +1 ;
        int guess = 0;
        int attempts= 0;
        System.out.println("welcome to random number guessing game");
        System.out.println("guess a number between 1 to 100");
        while (guess != randomnumber){
            System.out.println("Enter the guess:");
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomnumber){
                System.out.println("too high! Try again..");
            }else if (guess < randomnumber){
                System.out.println("too low! Try again..");
            }else{
                System.out.println("congratulations you guessed the number in " + attempts + " attempts.");
            }
        }
        scanner.close();       
    }
}

