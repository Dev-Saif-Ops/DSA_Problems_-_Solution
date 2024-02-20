package Java_revisit;

import java.net.Socket;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: Print th sum of n Natural numbers.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();

        // int sum = 0;
        // for(int i = 0; i <= n; i++)
        // {
        //     sum = sum+ i;
        // }
        // System.out.println("The SUM is: "+ sum);

        //Q. Print the table of a number input by the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n * i);
        }
    }
    
}
