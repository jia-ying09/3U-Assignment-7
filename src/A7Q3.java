
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
        System.out.println(numbers + ", ");
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

        for (int i = numbers; i > 0; i--) {

            if (numbers % i == 0) {

                
            }
            factors(numbers / i);
                System.out.print(factors + ", ");
        }
    }
}