/* Q: Take a matrix as input from the user. Searsch for a given number x and print the indices at which it occurs. */

package Java_revisit.Arrays;

import java.util.Scanner;

public class Twod_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the size of columns: ");
        int columns = sc.nextInt();

        //declare the 2d array
        int numbers[][] = new int[rows][columns];

        //input
        //rows
        for(int i = 0; i < rows; i++)
        {
            //columns
            for(int j = 0; j < columns; j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }

        //take x as a input
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        //output
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location {" + i + ", " + j + "}");
                }
            }
        }
    }
}
