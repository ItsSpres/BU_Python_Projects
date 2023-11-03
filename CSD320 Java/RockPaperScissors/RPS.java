/*
IAN SPRESNEY
CSD320 - JAVA PROGRAMMING
NOVEMBER 3, 2023
GITHUB REPO LINK: https://github.com/ItsSpres/My_University_Projects_BU/blob/main/CSD320%20Java/RockPaperScissors/RPS.java

SOURCES: W3 and some errors handled through the use of ChatGPT.
https://www.w3schools.com/java/
Although, this is still something I have done before. 

----PROMPT----
Write a program that is similar to the popular game titled “Rock-Paper-Scissors.” 
The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors. 
Then, the program is to prompt the user to enter a value of 1, 2, or 3. Next, the program displays a clear readable 
message displaying both the computer’s selection, the user’s selection, and the results.


WARNING!!
This program will continue to run or loop over. 
This is done so that you (professor) may more easily see the program generate random outputs.
 */

import java.util.Random;
import java.util.Scanner;

 public class RPS {
    public static void main(String[] args) {

        //for user input
        Scanner sc = new Scanner(System.in);
        //for generating our random numbers later
        Random r = new Random();

        //creating an array and initializing our results/choices within the game
        String[] rpsChoices = {"Rock", "Paper", "Scissors"};

        
        //Welcome message and user input prompt
        System.out.println("Welcome to ROCK, PAPER, SCISSORS the Java game!");

        while (true) { //will also make a loop so we can keep playing. 

            System.out.print("Enter your choice (rock, paper, or scissors) please enter as 1, 2, or 3: ");
            int userChoice = sc.nextInt(); //storing the user input as userChoice

            //checking user input
            if (!isValidChoice(userChoice)) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            //getting a random number from the computer and converting to a string value...
            int index = r.nextInt(3); //will return a random index from 0 to 2
            String compChoice = rpsChoices[index]; //putting the choice into a variable.

            //doing the same for user
            int playerIndex = userChoice - 1; //gotta get the correct index. 3 would be index 2. 
            String playerChoice = rpsChoices[playerIndex];

            //print computer's choice
            System.out.println("Computer chose: " + compChoice);

            //print user input
            System.out.println("Player chose: " + playerChoice);

            //send values to the decideWhoWon method and then return the results
            String result = decideWhoWon(playerChoice, compChoice);
            System.out.println(result);


        }
        
    }

    //check if user inputted a valid input of 1, 2, or 3
    public static boolean isValidChoice(int choice) {
        return choice == 1 || choice == 2 || choice == 3;
    }

    //figuring out who won or if it was a tie game
    //in this method we are taking the playerChoice variable and compChoice variable and comparing their values.
    public static String decideWhoWon(String playerChoice, String compChoice) {

        if (playerChoice.equals(compChoice)) { //if both are the same, then tie game obviously
            return "TIE GAME!";

            //The following determines who won and then either shows "you win" or "you lose"
        } else if (playerChoice.equals("Rock")) {
            return compChoice.equals("Scissors") ? "You win!" : "You lose!";

        } else if (playerChoice.equals("Paper")) {
            return compChoice.equals("Rock") ? "You win!" : "You lose!";

        } else {
            return compChoice.equals("Paper") ? "You win!" : "You lose!";
        }
    }
    
}
