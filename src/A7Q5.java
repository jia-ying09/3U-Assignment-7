
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A7Q5 {

    /**
     *
     */
    public static void chaotic(int pattern) {
        //congering numbers between 1 and 5
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
        {

            //creating a for loop for the random number
            for (int i = 0; i < randNum; i++) {

                //outputting the asterisks
                System.out.print("*");
            }
            //blank line
            System.out.println(" ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        chaotic(5);
        chaotic(3);
        chaotic(1);
        chaotic(2);
        chaotic(4);
        chaotic(1);
        chaotic(5);
        chaotic(4);
    }
}
