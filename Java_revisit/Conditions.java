package Java_revisit;

import java.util.*;

public class Conditions
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age >= 18) 
        {
            System.out.println("You are Eligible");
        }
        else
        {
            System.out.println("Your are not....");
        }
    }
}