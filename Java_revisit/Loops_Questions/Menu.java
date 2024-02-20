/*
 *  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.

    I Solved it with my own way.
 */


package Java_revisit.Loops_Questions;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        // Take the Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no either 1 or 0: ");
        int n = sc.nextInt();
        
        // Apply the conditions
        if (n == 1) 
        {
            // Take the Marks as a Input
            Scanner mk = new Scanner(System.in);
            System.out.print("Enter Marks out 0f 100: ");
            int Marks = mk.nextInt();

            if (Marks >= 90) {
                System.out.println("This is Good");
            }
            else if (Marks >= 60 && Marks <= 89) {
                System.out.println("This is also Good");
            } 
            else if (Marks >= 0 && Marks <= 59) {
                System.out.println("This is Good as well");
            } 
            else 
            {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
            }           
        }
        
        else
        {
            System.out.println("Stop");
        }

    }
}
