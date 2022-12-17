/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_study;

/**
 *
 * @author edaza
 */
import java.util.Scanner;
import java.util.Arrays;
public class Multiply_arrayA_withK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Length of the array");
        n = input.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) 
        {
            A[i] = input.nextInt();
        }
        System.out.print("Array :  ");
        System.out.println(Arrays.toString(A));
        System.out.println("Array should be multiplied with ...");
        int k = input.nextInt();
        System.out.println("RESULT: ");
        for (int i = 0; i < A.length; i++) {
            int out = A[i]*k ; 
            System.out.println(out);
        }
    }
    
}
