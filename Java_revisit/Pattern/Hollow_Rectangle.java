/*
 Print the pattern as below

***** 
*   * 
*   * 
*****

 */
package Java_revisit.Pattern;

import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        //for outer loop
        // for outer loop
        for(int i = 1; i <= n; i++)
        {
            // for inner loop
            for(int j = 1; j <= m; j++)
            {
                // print for outer loop
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            // print for inner loop
            System.out.println(" ");
        }

    }
    
}
