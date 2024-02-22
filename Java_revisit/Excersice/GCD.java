/* Q: Write a function that calculates the Greatest Common Divisor of 2 numbers.  */

package Java_revisit.Excersice;

import java.util.Scanner;

public class GCD {

    // Function to find GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking inputs
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        //function call to find GCD
        int gcd = findGCD(num1, num2);

        // Display Result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

    }  
}
