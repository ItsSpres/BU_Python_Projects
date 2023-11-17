/*
Ian Spresney
CSD 320
November 17, 2023
Module 6 Assignment

 Sources:
 https://www.w3schools.com/java/java_for_loop.asp
 https://stackoverflow.com/questions/8070313/how-do-i-write-a-program-to-output-a-triangle-of-numbers-in-java
 https://courses.cs.washington.edu/courses/cse142/17wi/lectures/01-11/slides/04-nested-loops-constants.pdf
 */


public class SpresneyNestLoop {
    public static void main(String[] args) {
        int numRows = 6;

        // Outer loop for each row
        for (int i = 1; i <= numRows; i++) {
            // Print spaces on the left side
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in increasing order
            for (int j = 1; j <= (1 << (i - 1)); j *= 2) {
                System.out.print(j + " ");
            }

            // Print numbers in decreasing order (excluding the last iteration)
            for (int j = (1 << (i - 2)); j >= 1 && i > 1; j /= 2) {
                System.out.print(j + " ");
            }

            // Print spaces on the right side
            for (int j = numRows - i; j >= 1; j--) {
                System.out.print("  ");
            }

            //I have given up on trying to make this work perfectly...
            //Cannot figured out why my formatting looks a little jank at the end.
            System.out.println("@");
        }
    }
}
