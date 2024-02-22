/* Q: Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
 */

package Java_revisit.Excersice;

import java.util.Scanner;

public class Fibonacci {

    //Function for printing Fibonacci series
    public static int printFibonacci(int n) {
        int a = 0; //First term of Fibonacci series
        int b = 1; //Second term of Fibonacci series
        for (int i = 0; i < n; i++)
        {
            //For printing the current term
            System.out.print(a + " ");

            //for calculating the next term update the a and b
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        //printing new line
        System.out.println();
        return b;
        
    }
    public static void main(String[] args) {

        //Taking n as a input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        //Printing Final result.
        System.out.println("The fibonacci sereis for following n is: ");
        printFibonacci(n);
    }
}
