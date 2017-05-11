
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A7Q9 {

    public static void allDigitsOdd(int number) {

        //creating a for loop
        for (int i = 0; i < number; i++) {

            //taking apart the number
            number = number /10 % 10;}

        //see if the number are divisiable
        if (number % 2 == 0) {

            //output that there are no even numbers
            System.out.println("There is an even number.");

            //else statement
        } else {

            //output that there are no even numbers
            System.out.println("There are no even numbers.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        //ask for the user to input numbers
        System.out.println("Enter a number:");

        //input the number given by the user
        int number = input.nextInt();

        //output wheither it is even or odd
        allDigitsOdd(number);


    }
}
