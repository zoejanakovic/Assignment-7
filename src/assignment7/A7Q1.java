/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author Janaz9178
 */
public class A7Q1 {

    /**
     * Calculates the area of a circle
     *
     * @param radius the radius of the circle
     * @return the area of the circle given the radius
     */
    public static double circleArea(double radius) {
        //find what r squared is then calculate the area using that to return an answer
        double rSquared = Math.pow(radius, 2);
        double area = Math.PI * rSquared;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //radius = 5, save return as a variable to output
        double answer = circleArea(5);
        System.out.println(answer);
    }
}
