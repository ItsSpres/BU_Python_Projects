/*
 Ian Spresney
 CSD 320 - Java
 November 12, 2023

 Assignment Module 5 - While Loop

 Sources: https://www.w3schools.com/java/default.asp, https://www.w3schools.com/java/java_while_loop.asp
 */

public class Loop {
    public static void main(String[] args) {
    
        // Display in smaller to larger order
        double smallToLargeResults = 0.0;
        //title
        System.out.println("Smaller ---> Larger");

        //will be incremented by two or decreased by two depending.
        double denominator = 3.0;

        //While loop for the smaller to larger
        while (denominator <= 99.0) { //checking if we have gotten to 99 yet.
            double x = 1.0 / denominator; //setting x to the result of each equations. EX: (1/3.0)
            smallToLargeResults += x; 
            //printing each new fraction
            System.out.print("1/" + denominator + " + ");
            //stepping up the number by two each time around.
            denominator += 2.0;
        }
        System.out.println("\nResult: " + smallToLargeResults);

        // Display in larger to smaller order
        double resultLargerToSmaller = 0.0;
        System.out.println("\nLarger ---> Smaller");

        denominator = 99.0;

        while (denominator >= 3.0) {
            double y = 1.0 / denominator;
            resultLargerToSmaller += y;
            System.out.print("1/" + denominator + " + ");
            denominator -= 2.0; //similar to before but now subtracting to get the reverse effect. 
        }
        //printing the results
        System.out.println("\nResult: " + resultLargerToSmaller);

    }
}