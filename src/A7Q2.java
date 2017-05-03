
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A7Q2 {

    /**
     *
     * @param grade
     * @return
     */
    public static int examGrade(String grade) {
        // Tell the user what grade they got
        System.out.println("You have an " + grade + ".");

        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        //ask the user to enter the marks
        System.out.println("Enter the mark in percentages: ");

        //input the grade guiven
        int grade = input.nextInt();

        //grade lower than 50
        if (grade < 50) {
            //output a F
            examGrade("F");

            //grade 50-59
        } else if (grade >= 50 && grade <= 59) {
            //output a D
            examGrade("D");

            //grade 60-69
        } else if (grade >= 60 && grade <= 69) {
            //output a C
            examGrade("C");

            //grade 70-79
        } else if (grade >= 70 && grade <= 79) {
            //output a B
            examGrade("B");

            //grade 80-100
        } else if (grade >= 80) {
            //output a A
            examGrade("A");
        }
    }
}
