/*
 Ian Spresney
 CSD320
 Module 9 Assignment
 11/30/2023

 Sources:
https://www.w3schools.com/java/java_howto_sum_of_array_elements.asp

 */

 //I did origianlly opt for the user to have to enter in all 20 ints.
 //I found this exhausting and decided that doing randomly generated numbers
 //might be more fun...

import java.util.Random;

public class ArraysMain {


    public static void main(String[] args) {

        // Create an array to store 20 integers
        int[] numbersArray = new int[20];

        // Fill the array with random integers
        fillArrayWithRandomNumbers(numbersArray);

        // Print the random numbers
        System.out.println("Randomly Generated Numbers Array...");
        printArray(numbersArray);

        // Calculate and display statistics
        displayStatistics(numbersArray);
    }

    // Method to fill the array with random integers
    private static void fillArrayWithRandomNumbers(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); //Range of the random numbers
        }
    }

    // Method to print the array elements
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Method to calculate and display statistics
    private static void displayStatistics(int[] arr) {
        int highest = arr[0];
        int lowest = arr[0];
        int sum = arr[0];

        // Calculate highest, lowest, and sum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }

            if (arr[i] < lowest) {
                lowest = arr[i];
            }

            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / arr.length;

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Highest Value: " + highest);
        System.out.println("Lowest Value: " + lowest);
        System.out.println("Sum of Numbers: " + sum);
        System.out.println("Average of Numbers: " + average);
    }
    //Can't say I am too sure what the overall assignment was suppose to look like. 
    //Hence why I used the random numbers. I had also thought that maybe you wanted the program
    //to read from a file or accept user input. Either way, I think this program got the point accross.
}
