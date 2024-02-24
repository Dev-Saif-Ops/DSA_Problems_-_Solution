/* Problem Link: https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120302/offering/1461353?leftPanelTabValue=PROBLEM&customSource=studio_nav */

import java.util.*;
class Solution {

	public static void main(String args[]) {

		// Write code here
		//take input
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		//check the conditions and print the values
		if(Character.isUpperCase(ch))
		{
			System.out.println("1");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("-1");
		}

	}
}
