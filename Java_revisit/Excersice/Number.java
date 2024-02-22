/* Q: Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n */

package Java_revisit.Excersice;

import java.util.Scanner;

public class Number {

    //function for this process
    public static void raisedToThePower(int x, int n) {
        int result = (int) (Math.pow(x, n));
        
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
    public static void main(String[] args) {

        //take the inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        //call the fuction
        raisedToThePower(x, n);
    }
}
