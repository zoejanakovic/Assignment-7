/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author janaz9178
 */
public class A7Q3 {
    
    public static void factors(int num){
        //for loop to check if the numbers 1 to num are evenly divisible aka factors
        //output factor if true
        for(int i = 1;i <= num;i++){
            if(num % i == 0){
                System.out.println(i);
        }
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // num = 10 and state the factiors will be listed below, run method factors
        int num = 10;
        System.out.println("The factors of " + num + " are as follows:");
        factors(num);
    }
}
