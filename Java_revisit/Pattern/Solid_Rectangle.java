/*
 Print the pattern as mentioned below

* * * * * *  
* * * * * *  
* * * * * *  
* * * * * * 
 
 */

package Java_revisit.Pattern;

import java.util.Scanner;

public class Solid_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        // for outer loop
        for(int i = 1; i <= n; i++)
        {
            // for inner loop
            for(int j = 0; j <= m; j++)
            {
                // print for outer loop
                System.out.print("* ");
            }
            // print for inner loop
            System.out.println(" ");
        }
    }
}
