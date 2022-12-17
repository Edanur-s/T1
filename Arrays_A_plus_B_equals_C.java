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

public class Arrays_A_plus_B_equals_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Length of the arrays");
        n = input.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("-------------");
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < n; i++) 
        {
            A[i] = input.nextInt();
        }
        System.out.print("First Array :  ");
        System.out.println(Arrays.toString(A));
        System.out.println("--------------");
        System.out.println("Enter the elements of second array");
        for (int i = 0; i < n; i++) 
        {
            B[i] = input.nextInt();
        }
        System.out.print("Second Array :  ");
        System.out.println(Arrays.toString(B));
        System.out.println("-------------------");
        System.out.println("Third Array: ");
        for (int i = 0; i < n; i++) 
        {
            int[] sum = new int[A[i] + B[i]];
            sum[i] = A[i] + B[i];
            System.out.println(sum[i]);
        }

    }
}
