/* Q: Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote. */

package Java_revisit.Excersice;

import java.util.Scanner;

public class Voteligible {

    //function to check
    public static void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("Congrats1 you are Eligible to vote");
        }
        else 
        {
            System.out.println("Sorry honey, you are not Eligible.");
        }
    }

    public static void main(String[] args) {

        //take age as input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your age: ");
        int age = sc.nextInt();

        //call the function
        checkEligibility(age);
    }
}
