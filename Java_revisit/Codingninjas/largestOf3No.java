/* Problem Link: https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120302/offering/1461355?leftPanelTabValue=PROBLEM&customSource=studio_nav */

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		// taking input 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int largest = findLargest(a, b, c);

        System.out.println(largest);
    }

    public static int findLargest(int a, int b, int c) {
        // Using Math.max to find the maximum among three numbers
        return Math.max(Math.max(a, b), c);
    }
}