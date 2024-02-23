/* Q: Take an array as input from the user. Search for a given number x and print the index at which it occurs. */

package Java_revisit.Arrays;

import java.util.Scanner;

public class Find_Index {

    public static void main(String[] args) {

        //take the size of Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        //declare the array
        int num[] = new int[size];

        //take the numbers for array
        System.out.print("Enter the no's for Arrays: ");

        //input
        for(int i = 0; i < size; i++)
        {
            num[i] = sc.nextInt();
        }

        //take the value of
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        //output
        for(int i = 0; i < num.length; i++)
        {
            if (num[i] == x) {
                System.out.println("x found at index: " + i);
            } 
           
        }

    }
}