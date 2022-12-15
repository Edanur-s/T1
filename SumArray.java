/*
Write a Java program to sum values of an array
 */
package arrays_study;

/**
 *
 * @author edaza
 */
import java.util.Arrays;
import java.util.Scanner;

public class SumArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("How much elements does this array have?");
        n = input.nextInt();
        int[] sumarray = new int[n];
        int sum = 0 ;
        for (int i = 0; i < sumarray.length; i++) {
              System.out.println("Enter the " +(i+1)+  ". element");
            sumarray[i]=input.nextInt();
        }
        System.out.print("Array: ");
          System.out.println(Arrays.toString(sumarray));
          for (int i = 0; i < sumarray.length; i++) {
            sum += sumarray[i] ;
        }
          System.out.println("Sum of the array = " +sum);
    }

}
