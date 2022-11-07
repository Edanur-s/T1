/*
Children (00-14 years)
Youth (15-24 years)
Adults (25-64 years)
Seniors (65 years and over)
According to https://www.statcan.gc.ca/en/concepts/definitions/age2
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    int x ;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter an age value");
        x = input.nextInt() ;
        if (0<=x && x<=14)
        {
            System.out.println("Children");
        }
        else if (15<=x && x<=24)
        {
            System.out.println("Youth");
        }
        else if (25<=x && x<=64)
        {
            System.out.println("Adult");
        }
        else if (65<=x && x<=123)
        {
            System.out.println("Senior");
        }
        else 
        {
            System.out.println("NO DATA !");
        }
            
                
    }
            
       
}
    
    

