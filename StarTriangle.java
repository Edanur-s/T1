/*


 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class StarTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.println("Please enter a number and watch this code make you a triangle");
        int a = input.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = i; j <=a; j++) {
                System.out.print(" "); 
            }
            for (int k =1; k <=i; k++) {
                System.out.print("*");
                System.out.print(" ");  
            }
            System.out.println(" ");
            
        }
    }
    
}
