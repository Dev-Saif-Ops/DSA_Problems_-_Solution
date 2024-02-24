/* Problem Link: https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120300/offering/1459163?leftPanelTabValue=PROBLEM&customSource=studio_nav   */


import java.util.Scanner;

class Solution {

	public static void main(String args[]) {

		// Write code here
		//take input
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int B = sc.nextInt();

		//calling the function
		areaOfRectangle(L, B);

	}

	//function for finding the area
	public static void areaOfRectangle(int L, int B)
	{
		int area = L * B;
		System.out.println(area);
	}
}
