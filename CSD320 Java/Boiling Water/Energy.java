/*
Ian Spresney
CSD320
Assignment Module 2 Energy Cal
10/26/2023

References for the following code can be found at this link:
https://www.w3schools.com/java/default.asp

I had originally tried to make this work with a "while" loop
like a previous python assignment I had done. Although, I had some issues with breaking away or 
looping back to the top. I was trying to achieve this with "if, else if, and else" statements.
Then I would call break to end if the user chose to do so. Not sure why I could not get it to work
but I will figure it out.
 */


import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        //Declaration of the user input
        //This will be reused for the rest of our input prompts
        Scanner sc = new Scanner(System.in);
    
        try{
            //Print messages
            System.out.println("Welcome to the Energy Calculator");
            System.out.println("Enter water weight in KILOGRAMS and only using WHOLE NUMBERS...");

            //Get weight of water
            int weight = sc.nextInt();

            //Get initial water temp
            System.out.println("Now we are going to need the STARTING (initial) temperature of the water...Whole numbers only and in Celsius...");
            int initTemp = sc.nextInt();

            //Get final water temp
            System.out.println("Now we are going to need the FINAL temperature of the water...and in Celsius...");
            int finalTemp = sc.nextInt();

            //Assign the formula to int variable 'q'
            int q = weight*(finalTemp-initTemp)*4184;
            System.out.println(q + " joules of energy...");
            
        }
        //handling any errors like miss types or Doubles during the whole process.
        catch(Exception e) {
                System.out.println("An error has occurred. Try again...");
        }
    }

}


