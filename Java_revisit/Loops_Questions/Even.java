/*
 * Print all even numbers till n.
 */

package Java_revisit.Loops_Questions;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("N is an Even no");            
        }
        else
        {
            System.out.println("N is an Odd no");
        }
    }
    
}
