/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author janaz9178
 */
public class A7Q4 {
    
    public static double compoundInterest(double initialAmount, double rate, int years){
        //calculate the compund interest and save it as the variable balance to return
        double exponent = Math.pow(1+rate, years);
        double balance = initialAmount*exponent;
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable answer for the return from compoundInterest, print answer
        double answer = compoundInterest(10, .5, 3);
        System.out.println(answer);
    }
}
