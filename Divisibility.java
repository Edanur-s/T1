/*
 
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Divisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x,y ;
        System.out.println("Enter an integer");
        x = input.nextInt();
        System.out.println("Enter the second integer");
        y = input.nextInt();
        if (x%y == 0)
        {
            System.out.println("X is divisible by y");
        }
        else
        {
            System.out.println("X is not divisible by y");
        }
        
    }
    
}
