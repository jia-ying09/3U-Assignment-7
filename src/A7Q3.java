
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
    public static void factors(int factor){
        
        factors(10);
        
        for (int i = 0; i < factor; i++){
        factor = factor/ i;
        
        }
      //  for (int i = 0; i < factor; i++){
        System.out.println (factor + ", ");
        
    
    }
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner (System.in);
        
        //input the number the user entered
        int number = input.nextInt();
        
      //  factors(10);
        
        
    }
}
