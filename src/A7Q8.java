
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

        //12/16 : 3/15 is winter
        if (month == 1 || month == 2 || month <= 3 && day <= 15 || month == 12 && day >= 16) {
            //ouput winter
            System.out.println("Winter");

            //3/16 : 6/15 is spring
        } else if (month == 3 && day >= 16 || month == 4 || month == 5 || month <= 6 && day <= 15) {
            //output spring
            System.out.println("Spring");

            //6/16 : 9/15 is summer
        } else if (month == 6 && day >= 16 || month == 7 || month == 8 || month <= 9 && day <= 15) {
            //output summer
            System.out.println("Summer");

            //9/16 : 12/15 is fall
        } else if (month == 9 && day >= 16 || month == 10 || month == 11 || month == 12 && day <= 15) {
            //output fall
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

        //output the season
        season(month, day);

    }
}