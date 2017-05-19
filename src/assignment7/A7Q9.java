/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author janaz9178
 */
public class A7Q9 {
    
    //method to check if all the digits are odd in a number and tell user if true or false
    public static void allDigitsOdd(int num) {

        //loop to check all the digits in the number by breaking into its digits
        while (num >= 1) {
            int remainder = num % 10;
            
            //if statements to check if the digits are even or odd
            //as soon as even, output false, if all are checked and odd, output false
            if (remainder % 2 == 0) {
                System.out.println(false);
                break;
            } else if (remainder % 2 != 0 && num < 10) {
                System.out.println(true);
            }
            num = num / 10;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // call method allDigitsOdd where the number is 879
        allDigitsOdd(879);
    }
}
