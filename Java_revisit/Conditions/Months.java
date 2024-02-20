package Java_revisit;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of month: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            {
                System.out.println("January");
                break;
            }
            case 2:
            {
                System.out.println("February");
                break;
            }
            case 3:
            {
                System.out.println("March");
                break;
            }
            default:
            {
                System.out.println("This way you can continue");
            }
                
                
        }
    }
    
}
