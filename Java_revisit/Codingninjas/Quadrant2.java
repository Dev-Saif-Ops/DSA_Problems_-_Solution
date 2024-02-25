import java.util.Scanner;

public class Quadrant2 {
    public static void main(String args[]) {

        // Write code here
        // take input
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // calling the function
        quadrantCoordinate(x, y);

    }

    // function to check and print
    public static void quadrantCoordinate(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th Quadrant");
        } else if (x != 0 && y == 0) {
            System.out.println("x axis");
        } else if (x == 0 && y != 0) {
            System.out.println("y axis");
        } else {
            System.out.println("origin");
        }
    }
    
}
