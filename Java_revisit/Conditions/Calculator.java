package Java_revisit.Conditions;

import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no a: ");
        int a = sc.nextInt();
        System.out.print("Enter no b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator(+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
            {
                System.out.println("Addition is: " + (a + b));
                break;
            }
            case '-':
            {
                System.out.println("Subtaction is: " + (a - b));
                break;
            }
            case '*':
            {
                System.out.println("Multiplication is: " + (a * b));
                break;
            }
            case '/':
            {
                System.out.println("Devidation is: " + (a / b));
                break;
            }
            case '%':
            {
                System.out.println("Modulo is: " + (a % b));
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }

        }
    }

}
