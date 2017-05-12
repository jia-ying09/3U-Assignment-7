
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A7Q3 {

    /**
     *
     * @param factor
     */
    public static void factors(int numbers) {

        //outputting the factors
        System.out.print(numbers + ", ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create scanner
        Scanner input = new Scanner(System.in);

        //ask for the number
        System.out.println("Please enter the number you want factored:");

        //input the number the user entered
        int numbers = input.nextInt();

        //for loop to collect all the numbers counting up to the  number
        for (int i = numbers; i > 0; i--) {

            //divide the numbers to get the factors
            if (numbers % i == 0) {

                //outputting the factors for the numbers
                factors(numbers / i);
            }
        }
    }
}