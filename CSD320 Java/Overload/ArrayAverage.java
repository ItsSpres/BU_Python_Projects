/**
 * Name: Ian Spresney
 * Calss: CSD320 - Assignment Module 10
 * Date: 12/09/2023
 * 
 * This program defines four overloaded methods to calculate the average of arrays
 * of different numeric types.
 * 
 * Sources:
 * - https://www.w3schools.com/java/java_methods_overloading.asp
 * - https://w3schools.com/java/java_arrays.asp
 */

 public class ArrayAverage {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        // Check if the array is null or empty
        if (array == null || array.length == 0) {
            return 0; // Return 0 for an empty array
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (short num : array) {
            sum += num;
        }

        // Calculate and return the average (casting to short)
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        // Check if the array is null or empty
        if (array == null || array.length == 0) {
            return 0; // Return 0 for an empty array
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate and return the average
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        // Check if the array is null or empty
        if (array == null || array.length == 0) {
            return 0; // Return 0 for an empty array
        }

        // Calculate the sum of the array elements
        long sum = 0;
        for (long num : array) {
            sum += num;
        }

        // Calculate and return the average
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        // Check if the array is null or empty
        if (array == null || array.length == 0) {
            return 0; // Return 0.0 for an empty array
        }

        // Calculate the sum of the array elements
        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        // Calculate and return the average
        return sum / array.length;
    }

    // Main method for testing the average methods
    public static void main(String[] args) {
        // Test arrays of different sizes and data types
        short[] shortArray = { 10, 20, 30, 40, 50 };
        int[] intArray = { 5, 10, 15, 20, 25, 30 };
        long[] longArray = { 1000, 2000, 3000, 4000 };
        double[] doubleArray = { 2.5, 5.5, 7.5, 10.5, 12.5 };

        // Test and display results
        System.out.println("Short Array Average: " + average(shortArray));
        displayArray(shortArray);

        System.out.println("\nInt Array Average: " + average(intArray));
        displayArray(intArray);

        System.out.println("\nLong Array Average: " + average(longArray));
        displayArray(longArray);

        System.out.println("\nDouble Array Average: " + average(doubleArray));
        displayArray(doubleArray);
    }

    // Method to display the elements of a short array
    private static void displayArray(short[] array) {
        System.out.print("Array elements: ");
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to display the elements of an int array
    private static void displayArray(int[] array) {
        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to display the elements of a long array
    private static void displayArray(long[] array) {
        System.out.print("Array elements: ");
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to display the elements of a double array
    private static void displayArray(double[] array) {
        System.out.print("Array elements: ");
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
