
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
    public static int factors(int factor) {
        Scanner input = new Scanner (System.in);
        for (int i = 10; i > 0; i++) {
        }

        int number = input.nextInt();
        return 0;

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
        int number = input.nextInt();

        //looping through all the numbers the number can be divided by
        for (int i = 0; i == number; i++) {
            int factor = number/i;
            System.out.println(factor);
        }


        //divide the number by numbers that can be divided
        //int factors = number / i;

     //   System.out.print(factors);
    }
}

