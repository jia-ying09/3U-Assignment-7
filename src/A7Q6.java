
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A7Q6 {

    public static void lastDigit(int last) {

        //pulling apart the number
        last = last % 10;

        //output the last digit
        System.out.println(last);

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
        int last = input.nextInt();

        //outputting the last digit of the number
        lastDigit(last);

    }
}
