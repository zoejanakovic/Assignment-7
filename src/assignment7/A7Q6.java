/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author janaz9178
 */
public class A7Q6 {

    //finds last digit of an integer
    public static int lastDigit(int num) {
        //find the remainder of the num/10 which is the last digit and return
        int lastDigit = num % 10;
        return lastDigit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int answer is the return value from the method lastDigit when the num is 122
        //print int answer
        int answer = lastDigit(122);
        System.out.println(answer);
    }
}
