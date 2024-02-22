/*Q: Write a function to print the sum of all odd numbers from 1 to n. */

package Java_revisit.Excersice;

import java.util.Scanner;

public class Sum_of_odd {
    public static void main(String[] args) {
        
        //take input n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        //initialize sum as 0
        int sum = 0;

        //create a for loop
        for(int i = 1; i <= n; i = i+2 )
        {
            System.out.println(i);

            //add value of i with sum
            sum += i;
        }

        //print final value
        System.out.println("Sum of odd no's is: "+ sum);
    }
}
