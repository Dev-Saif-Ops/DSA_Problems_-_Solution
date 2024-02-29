/* Problem Link: https://www.codingninjas.com/studio/problems/insertion-sort_3155179?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM */

package Robert_Lafore_Summary.Simple_Sort.Insertion_Sort.DSA_Sheet;

import java.util.* ;
import java.io.*; 

public class insertionSort {
    public static void insertionSort(int n , int[] arr) {
		// Write your code here.
		int i, j, x;
		for(i = 1; i < n; i++)
		{
			j = i - 1;
			x = arr[i];

			while(j > -1 && arr[j] > x)
			{
				arr[j + 1] = arr [j];
				j--;
			}
			arr[j + 1] = x;
		}
	}
    
}
