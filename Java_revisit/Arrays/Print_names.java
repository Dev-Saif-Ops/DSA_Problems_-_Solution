/* Q: Take an array of names as input from the user and print them on the screen. */

package Java_revisit.Arrays;

import java.util.Scanner;

public class Print_names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        //declare the array
        String name[] = new String[size];

        //input
        for(int i = 0; i < size; i++)
        {
            name[i] = sc.nextLine();
        }

        //output
        for(int i = 0; i < name.length; i++)
        {
            System.out.println("name " + (i + 1) + " is: " + name[i]);
        }
    }
}
