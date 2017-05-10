
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A7Q8 {

    public static int season(int month, int day) {

        if (month <= 3 && day >= 15 || month == 12 && day <= 16 ) {
            System.out.println("Winter");
        }

        if (month == 3 && day >= 16 || month <= 6 && day >= 15) {
            System.out.println("Spring");
        }

        if (month == 6 && day <= 16 || month <= 9 && day >= 15) {
            System.out.println("Summer");
        }

        if (month == 9 && day >= 16 || month == 12 && day >= 15) {
            System.out.println("Fall");
        }
        return month;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        //ask for the month
        System.out.println("Please enter the month in numerals: ");
        //input the month
        int month = input.nextInt();

        //ask for the day
        System.out.println("Please enter the day of the month: ");
        //input the day
        int day = input.nextInt();

        season(month, day);

    }
}
