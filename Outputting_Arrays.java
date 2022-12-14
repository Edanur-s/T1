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
public class Outputting_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // create an array
        int[] age = {12, 4, 5, 2, 5};

        // access each array elements
        
        //Bad example
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        System.out.println("-----------");

        //a bit good example
        for (int i = 0; i < age.length; i++) 
        {
            System.out.println(age[i]);
        }

        System.out.println("-----------");

        //better example
        for (int i : age) 
        {
            System.out.println(i);
        }

    }
}

    

