/* Problem Link: https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120300/offering/1459164?leftPanelTabValue=PROBLEM&customSource=studio_nav */

import java.util.*;

class Solution {

	public static void main(String args[]) {

		// Write code here
		//taking input
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();

		//calling the function
		nameAge(name, age);

	}

	//fuction for printing
	public static void nameAge(String name, int age)
	{
		System.out.println("The name of the person is " + name + " and the age is " + age + ".");
	}
}
