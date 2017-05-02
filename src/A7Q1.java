
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linj4653
 */
public class A7Q1 {
    /**
     * 
     * @param radius
     * @return 
     */
    public static double circleArea(double radius) {
           double rSquared = Math.pow(radius, 2);
        double area = Math.PI*rSquared;
            return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner (System.in);
        
        //ask user to enter the radius
        System.out.println("Enter the radius of the circle in centimeters");
        
        //input the radius of the circle
        double radius = input.nextDouble();
        
        //calculate the answer of the area
        double answer = circleArea(radius);
        
        //round to the nearest hundredth
        answer = Math.round(answer*100.0)/100.0;
        
        //output the answer
        System.out.println("The area of the circle is " + answer + "cm squared.");
        
    }
}
