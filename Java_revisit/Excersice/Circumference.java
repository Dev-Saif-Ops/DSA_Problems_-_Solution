/* Q: Write a function that takes in the radius as input and returns the circumference of a circle */

package Java_revisit.Excersice;

import java.util.Scanner;

public class Circumference {

    //function for calculating circumference
    public static void circumferenceOfCircle(int rd) {
        int circumference = (int) (2 * Math.PI * rd);
        System.out.println("The Circumference of the circle for the given radius is: "+ circumference);
    }
    public static void main(String[] args) {

        //taking radius as a input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int rd = sc.nextInt();

        //calling function
        circumferenceOfCircle(rd);
    }
}
