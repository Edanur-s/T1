/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Digit_Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x ;
        System.out.println("Please enter a number");
        x = input.nextInt();
        int s = 0 ;
        while (x>0)
        {
            x /=10 ;
            s++ ;
        }
        System.out.println("This number contains " + s +  " digits.");
    }
    
}
