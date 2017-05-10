
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A7Q4 {

    public static double compoundInterest(double principal, double interest, int years) {
        //calculating the power for the number of years
        double power = Math.pow(1 + interest, years);

        //calculating the interest rate
        double balance = principal * power;
        
        balance = Math.round(balance);

        
        //outputing the calculation
        System.out.println("Your compound interest is " + balance + ".");

        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask for the initial principal
        System.out.println("Enter the initial principal:");


        //input the new principal
        double principal = input.nextDouble();

        //ask for the interest rate
        System.out.println("Enter the interest rate:");

        //input the interest rate
        double interest = input.nextDouble();


        //ask for the number of years that have past
        System.out.println("Enter the number of years:");


        //input the given years
        int years = input.nextInt();

        //calculate the compund interest
        compoundInterest(principal, interest, years);

    }
}
