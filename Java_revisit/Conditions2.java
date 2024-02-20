package Java_revisit;
import java.util.*;

public class Conditions2 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no: ");
        int x = sc.nextInt();

        if (x % 2 == 0) 
        {
            System.out.println("EVEN");            
        }
        else
        {
            System.out.println("ODD");
        }
    }
    
}
