/*
Ian Spresney
CSD320-Java
Module 1 Assignment
10-16-2023

----PROMPT----
Write a program that displays the results of:
4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )
And
4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )

----DISCUSSION----
I believe that the reason the outputs are different is because one is in the form of doubles while the other 
is in the form of integers. If we use integers, then decimal places are ignored and the values are rounded up or down. 
Right? Then if we include doubles we are then including the decimal places and then receive a more accurate result.
Our first output was 3.2837384837384844.
The second was 4.

Working with Doubles would be the ideal method as it provides more accuracy. 
Integers are more useful for dealing with whole number values and when fractional
values aren't being used. 

----MY GITHUB REPO----
https://github.com/ItsSpres/My_University_Projects_BU/blob/main/CSD320%20Java/DoubleVSInt/main.java

----SOURCES----
https://www.w3schools.com/java/
*/

public class main {
    public static void main(String[] args) {
      double first = 4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 );
      int second = 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );

      System.out.println(first); //3.2837384837384844
      System.out.println(second); //4
    }
}
