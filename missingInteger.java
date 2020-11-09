
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zerakiassessment;

//import java.lang.reflect.Array;
import java.sql.Array;
import java.util.Scanner;

/**
 *
 * @author Eclectics
 */
public class missingInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                int array_sum = 0;
                
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Input number of elements in array:");
        int n = myObj.nextInt();
        int[] k = new int[n] ;
        System.out.println("Input array elements:");
        for(int i = 0; i < n; i++)
        {
            k[i] = myObj.nextInt();
            array_sum = array_sum + k[i];
        }
      // System.out.println("Sum of array:"+array_sum);
// String input
              
        int result;
        result = missingInteger(array_sum, n);
        System.out.println(result);
    }
    
    private static int missingInteger(int sum, int n){
        int result = 0;
        int sum_array = 0;
        
        //get sum of array with all expected elements 
         for(int i = 1; i <= n+1; i++)
        {
            // System.out.println(i);
            sum_array += i;
        }
        // System.out.println("real sum of array:"+sum_array);
        result = sum_array - sum;
        return result;
        
    }
    
}
