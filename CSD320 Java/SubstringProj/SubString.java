/*
Ian Spresney
Bellevue University
CSD320 - Java
Substring Assignment
Sources: W3 for minor syntax formatting, etc.

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
        */
        if (numberOneString.contains(numberTwoString)) {
            System.out.println("'" + numberTwoString + "' is a substring of '" + numberTwoString + "'");

        } else if (numberTwoString.contains(numberOneString)) {
            System.out.println("'" + numberOneString + "' is a substring of '" + numberTwoString + "'");

        } else {
            System.out.println("...neither string is a substring of the other...");
        }
        sc.close();
    }
}
