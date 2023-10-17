/*
Ian Spresney
CSD320-Java
10-16-2023

I believe that the reason the outputs are different is because one is in the form of doubles while the other 
is in the form of integers. If we use integers, then decimal places are ignored and the values are rounded up or down. 
Right? Then if we include doubles we are then including the decimal places and then receive a more accurate result.
Our first output was 3.2837384837384844.
The second was 4.
*/

public class main {
    public static void main(String[] args) {
      double first = 4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 );
      int second = 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );

      System.out.println(first);
      System.out.println(second);
        
    }
}
