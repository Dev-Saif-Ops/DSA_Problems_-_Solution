/* Q: Write a function which takes in 2 numbers and returns the greater of those two.
 */

package Java_revisit.Excersice;

import java.util.Scanner;

public class Find_greater {

    //function to find greater no
    public static void findGreater(int a, int b) {
        if (a > b) 
        {
            System.out.println("a is greater");   
        }
        else
        {
            System.out.println("b is greater");
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Please enter 2 no's");
        
        //take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no a: ");
        int a = sc.nextInt();
        System.out.print("Enter no b: ");
        int b = sc.nextInt();

        //call the findGreater function
        findGreater(a, b);
    }
}
