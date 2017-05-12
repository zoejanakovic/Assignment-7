/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author janaz9178
 */
public class A7Q7 {
    
    //tells you the first digit of any integer
    public static int firstDigit(int num) {
        
        //if statement to change -ves to +ves
        if (num < 0) {
            num = num / -1;
        }
        
        //while loop to move decimal until theres only one integer digit and return
        while (num > 9 || num < -9) {
            num = num / 10;
        }
        return num;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // variabkle answer is the return from the method and print the answer
        int answer = firstDigit(-4653);
        System.out.println(answer);
    }
}
