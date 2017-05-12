/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author janaz9178
 */
public class A7Q5 {

    //generates a random number of astersks between 1 and 5 for a desired number of times 
    public static void chaotic(int lines) {

        //for loop to repeat printing the asterisks for the number of lines
        for (int i = 0; i < lines; i++) {

            //produce a random number
            //make a blank string called asterisks and for loop to put the random * in
            //output the finished string
            int randLength = (int) (Math.random() * (5 - 1 + 1)) + 1;
            String asterisks = "";
            for (int n = 0; n < randLength; n++) {
                asterisks = asterisks + "*";
            }
            System.out.println(asterisks);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call chaotic method
        chaotic(5);
    }
}
