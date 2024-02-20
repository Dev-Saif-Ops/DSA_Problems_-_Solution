package Java_revisit;

import java.util.Scanner;

public class Conditions3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a > b) 
        {
            System.out.println("a is GREATER");   
        }
        else if (a < b) 
        {
            System.out.println("a is LESSER");
        }
        else
        {
            System.out.println("EQUAL");
        }

    }   
}
