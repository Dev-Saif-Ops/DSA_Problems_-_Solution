import java.util.Scanner;

public class Questions {
    // function to take name as input
    public static void printMyName(String name) {
        System.out.println(name);
        return;   
    }

    // function to sum 2 no's
    public static int calculateSum (int a, int b) {
        int sum =  a + b;
        return sum;
    }

    // function to multiply 2 no's
    public static int multiplyNumbers(int a, int b) {
        int mult = a * b;
        return mult;
        
    }

    //function to calculate factorial
    public static void findFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid no");
            return ;
        }
        
        int factorial = 1;

        for(int i = n; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("The factorial of your no is: "+ factorial);
    }
    public static void main(String[] args) {
        //take input for name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        
        //call printMyName with printing
        System.out.print("your name is: ");
        printMyName(name);

        //input for sum
        System.out.print("Enter no a: ");
        int a = sc.nextInt();
        System.out.print("Enter no b: ");
        int b = sc.nextInt();  
        
        //input for factorial
        System.out.print("Enter the no to find the factorial: ");
        int n = sc.nextInt();

        //call calculateSum
        int sum = calculateSum(a, b);
        System.out.println("The sum of two no's is: "+ sum);
    
        //call multiplyNumbers
        int mult = multiplyNumbers(a, b);
        System.out.println("Multiplication is: "+ mult);

        //call findFactorial
        findFactorial(n);
    }

}
