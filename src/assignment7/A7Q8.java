/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author Janaz9178
 */
public class A7Q8 {
    
    //method to determine and output the season of a given month and day
    public static void season(int month, int day) {
        
        //if statements to find what season the date is included in
        //then output the season
        if (month == 1 || month == 2 || (month == 12 && day >= 16) || (month == 3 && day <= 15)) {
            System.out.println("Winter");
        } else if (month == 4 || month == 5 || (month == 3 && day >= 16) || (month == 6 && day <= 15)) {
            System.out.println("Spring");
        } else if (month == 7 || month == 8 || (month == 6 && day >= 16) || (month == 9 && day <= 15)) {
            System.out.println("Summer");
        } else if (month == 10 || month == 11 || (month == 9 && day >= 16) || (month == 12 && day <= 15)) {
            System.out.println("Fall");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call method season the find season for the month 12 and day 23
        season(12, 23);
    }
}
