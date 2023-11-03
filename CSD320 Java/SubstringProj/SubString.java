/*
Ian Spresney
Bellevue University
CSD320 - Java
Substring Assignment

Sources: W3 for minor syntax formatting, etc. 
Used ChatGPT for cantains definition and syntax.
Prompt used: "what is the contains mean in java"
Result: Provided me with a clear and quick definition 
with examples of syntax. 
Plan: I then took this and applied it in ways I already knew such are a 
if-then-else statement and so on. 

----PROMPT----
Write a program that prompts a user to enter two strings and then checks the strings 
entered and reports if either the first string is a substring of the second string, 
or if the second string is a substring of the first string.
*/
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        //for user input
        Scanner sc = new Scanner(System.in);   
        
        //User enters the first string
        System.out.println("Enter first string: "); //print prompt
        String numberOneString = sc.nextLine(); //user enters string

        //User enters the second string
        System.out.println("Enter second string: ");
        String numberTwoString = sc.nextLine();

        /*
        So I am assuming we are just comparing strings.
        The following is pretty simple. 
        First we comparer the first string to the second and verify 
        that it is not a substring and then we continue on with comparing.

        "contains" is used to see if a string has a sequence of characters that match in 
        another string. If not then we will try the opposite comparison. If 
        not again, then we can conclude that there is no substring.
        */
        if (numberOneString.contains(numberTwoString)) {
            System.out.println("'" + numberTwoString + "' is a substring of '" + numberOneString + "'");

        } else if (numberTwoString.contains(numberOneString)) {
            System.out.println("'" + numberOneString + "' is a substring of '" + numberTwoString + "'");

        } else {
            System.out.println("...neither string is a substring of the other...");
        }
        sc.close();
    }
}
