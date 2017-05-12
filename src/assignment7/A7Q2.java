/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author janaz9178
 */
public class A7Q2 {
    
    public static void examGrade(int percent){
        //if statements to print the letter that coincides with the given grade
        if(percent<50){
            System.out.println("F");
        }if(percent>=50 && percent<=59){
            System.out.println("D");
        }if(percent>=60 && percent<=69){
            System.out.println("C");
        }if(percent>=70 && percent<=79){
            System.out.println("B");
        }if(percent>=80){
            System.out.println("A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        examGrade(50);
    }
}
