
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 3;

    public static void main(String[] args) {
        //Initialize a Random object for generating random number.
        Random R = new Random();

        //Initialize a Scanner object for  user input.
        Scanner Sc = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds : 3");
        System.out.println("Attempts To Guess Number In Each Round : 10\n");

        //Loop through each round.
        for (int i = 1; i <= MAX_ROUNDS; i++) {
            //Generate a random number for current round.
            int number = R.nextInt(MAX_RANGE) + MIN_RANGE;
            int attempts = 0;
            //Display round information.
            System.out.printf("Round "+i+" : Guess the number between "+MIN_RANGE+" and "+MAX_RANGE+" in "+MAX_ATTEMPTS+" attempts.\n");
            //Loop until the maximum attempts are reached.
            while (attempts < MAX_ATTEMPTS) {
                System.out.println("Enter your guess : ");
                int guess_number = Sc.nextInt(); //Get the user guess.
                attempts = attempts + 1; //Increment the round count.
                //Check if guess is correct.
                if (guess_number == number) {
                    int score = MAX_ATTEMPTS - (attempts-1); //Calculate the score for the current round.
                    totalScore = totalScore + score; //Update the total score.
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts ="+attempts+". Round Score = "+score+".\n");
                    break; //Exit the loop if guess is correct.
                }

                else if (guess_number < number) {
                    System.out.printf("The number is greater than "+guess_number+". Attempts Left = "+ (MAX_ATTEMPTS - attempts) + ".\n");
                }

                else if (guess_number > number) {
                    System.out.printf("The number is less than "+  guess_number+ ". Attempts Left ="+(MAX_ATTEMPTS - attempts)+".\n");
                }

            }
            //Display the result if maximum attempts are reached without a correct guess.
            if (attempts == MAX_ATTEMPTS) {
                System.out.printf("\nRound ="+i+"\n");
                System.out.println("Score = 0");
                System.out.printf("The Random Number Is :"+number+"\n\n");
            }
        }
        System.out.printf("Game Over. Total Score ="+totalScore+"\n");
        Sc.close();
    }
}
