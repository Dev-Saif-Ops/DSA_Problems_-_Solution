/* Problem Link: https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120302/offering/1461356?leftPanelTabValue=PROBLEM&customSource=studio_nav */

import java.util.Scanner;

public class Quadrant {
    public static void main(String args[]) {

        // Write code here

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = sc.nextInt();

        if(x>0 && y>0) System.out.println("1st Quadrant");

        else if(x<0 && y>0) System.out.println("2nd Quadrant");

        else if(x<0 && y<0) System.out.println("3rd Quadrant");

        else if(x>0 && y<0) System.out.println("4th Quadrant");

        else if(x==0 && y!=0) System.out.println("y axis");

        else if(x!=0 && y==0) System.out.println("x axis");

        else System.out.println("Origin");

    }

    
}
