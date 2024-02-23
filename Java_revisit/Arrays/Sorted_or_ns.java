package Java_revisit.Arrays;

import java.util.Scanner;

public class Sorted_or_ns {
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

        boolean isAscending = true;

        //output
        for(int i = 0; i < numbers.length - 1; i++)
        {
            if (numbers[i] > numbers[i + 1]) {
                
                isAscending = false;
            }
        }

        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } 
        else {
            System.out.println("The array is not sorted in ascending order");
        }
 
        
    }
    
}
