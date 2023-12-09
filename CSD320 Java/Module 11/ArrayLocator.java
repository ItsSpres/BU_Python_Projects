/*
Name: Ian Spresney
Class: CSD320 - Module 11
Date: 12/09/2023
Sources:
https://www.w3schools.com/java/java_arrays.asp
https://www.w3schools.com/java/java_arrays_multi.asp

Summary of Prompt:
Write methods to locate the largest and smallest elements in a 2D array, 
returning a one-dimensional array with two location elements. 
Two sets of methods are required, one for double arrays and another for int arrays.

Method Signatures:
1. public static int[] locateLargest(double[][] arrayParam)
2. public static int[] locateLargest(int[][] arrayParam)
3. public static int[] locateSmallest(double[][] arrayParam)
4. public static int[] locateSmallest(int[][] arrayParam)
*/

public class ArrayLocator {

    // Method to locate the largest element in a 2D array of doubles
    public static int[] locateLargest(double[][] arrayParam) {
        // Check for null or empty array
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            // Handle invalid array input
            return null;
        }

        // Initialize variables to store location and maximum element
        int[] location = {0, 0};
        double maxElement = arrayParam[0][0];

        // Loop through the array to find the largest element and its location
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > maxElement) {
                    maxElement = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        // Return the location of the largest element
        return location;
    }

    // Method to locate the largest element in a 2D array of integers
    public static int[] locateLargest(int[][] arrayParam) {
        // Check for null or empty array
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            // Handle invalid array input
            return null;
        }

        // Initialize variables to store location and maximum element
        int[] location = {0, 0};
        int maxElement = arrayParam[0][0];

        // Loop through the array to find the largest element and its location
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > maxElement) {
                    maxElement = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        // Return the location of the largest element
        return location;
    }

    // Method to locate the smallest element in a 2D array of doubles
    public static int[] locateSmallest(double[][] arrayParam) {
        // Check for null or empty array
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            // Handle invalid array input
            return null;
        }

        // Initialize variables to store location and minimum element
        int[] location = {0, 0};
        double minElement = arrayParam[0][0];

        // Loop through the array to find the smallest element and its location
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < minElement) {
                    minElement = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        // Return the location of the smallest element
        return location;
    }

    // Method to locate the smallest element in a 2D array of integers
    public static int[] locateSmallest(int[][] arrayParam) {
        // Check for null or empty array
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            // Handle invalid array input
            return null;
        }

        // Initialize variables to store location and minimum element
        int[] location = {0, 0};
        int minElement = arrayParam[0][0];

        // Loop through the array to find the smallest element and its location
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < minElement) {
                    minElement = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        // Return the location of the smallest element
        return location;
    }

    // Main method for testing
    public static void main(String[] args) {
        double[][] doubleArray = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        int[][] intArray = {{5, 3, 2}, {8, 1, 4}};

        // Test the locateLargest and locateSmallest methods
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        // Print results
        System.out.println("Largest element in doubleArray: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest element in doubleArray: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
        System.out.println("Largest element in intArray: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest element in intArray: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
    }
}
