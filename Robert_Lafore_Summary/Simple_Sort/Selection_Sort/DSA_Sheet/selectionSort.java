/* Problem Link: https://www.codingninjas.com/studio/problems/selection-sort_981162?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM */

package Robert_Lafore_Summary.Simple_Sort.Selection_Sort.DSA_Sheet;

import java.util.* ;
import java.io.*; 

public class selectionSort {
    public static void selectionSort(int arr[], int n) {
		// Write your code here.
		int i, j, k;
		//loop for starting pointer
		for(i = 0; i < n - 1; i++)
		{
			//loop for checking smallest element
			for(j = k = i; j < n; j++)
			{
				//check if j is smaller than k
				if(arr[j] < arr[k])
				{
					k = j;
				}
			}
			
			//calling swap
			swap(arr, i, k);
		}
	}

    //--------------------------------------------------------
    //function for swap
	private static void swap(int arr[], int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
    
}
