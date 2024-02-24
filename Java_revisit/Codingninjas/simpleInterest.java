/* Problem Link: https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120300/offering/1459166?leftPanelTabValue=PROBLEM&customSource=studio_nav */

import java.util.* ;
import java.io.*;
class Solution {

	public static void main(String args[]) {

		// Write code here
		//take input
		Scanner sc = new Scanner(System.in);
		double pa = sc.nextDouble();
		double roi = sc.nextDouble();
		double tp = sc.nextDouble();

		//call the function
		calculateSimpleInterest(pa, roi, tp);

	}

	//make the function for operation
	public static void calculateSimpleInterest(double pa, double roi, double tp)
	{
		//way to calculate Simple Interest.
		double si = (pa * roi * tp) /100;
		System.out.println((int)si);
	}
}
