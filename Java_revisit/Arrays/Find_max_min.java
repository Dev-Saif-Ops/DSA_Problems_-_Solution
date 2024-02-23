/* Q: Find the maximum & minimum number in an array of integers. */

package Java_revisit.Arrays;

import java.util.Scanner;

public class Find_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        //declare the array
        int numbers[] = new int[size];

        //take numbers as input
        System.out.println("Enter the numbers: ");

        for(int i = 0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for(int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest no is: " + max);
        System.out.println("Smallest no is: " + min);
    }
}
