/* Q: Enter 3 numbers from the user & make a function to print their average. */

package Java_revisit.Excersice;

import java.util.Scanner;

public class Average {

    //function for printing the average
    public static void printAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("The average of 3 no's is: "+ average);
        
    }
    public static void main(String[] args) {

        //taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("To take the average you have to input three no's lets do that");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        //calling the printAverage function
        printAverage(a, b, c);
        
    }
    
}
