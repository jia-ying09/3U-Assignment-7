
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A7Q7 {

    public static void firstDigit(int first) {

        for (int i = 2; i < first; i++) {

            //pulling apart the number
            first = first / 10;
        }

        //output the first digit
        System.out.println(first);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        //ask the user to enter the number
        System.out.println("Enter the number:");

        //input the number
        int first = input.nextInt();

        //outputting the first digit of the number
        firstDigit(first);
    }
}
