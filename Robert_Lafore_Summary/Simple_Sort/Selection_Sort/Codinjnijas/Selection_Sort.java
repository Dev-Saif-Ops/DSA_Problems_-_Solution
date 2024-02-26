/* Problem link: https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms-new/content/662512/offering/10676519?leftPanelTabValue=PROBLEM&customSource=studio_nav */

package Robert_Lafore_Summary.Simple_Sort.Selection_Sort.Codinjnijas;

import java.util.* ;
import java.io.*; 

//--------------------------------------------------------

public class Selection_Sort {
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
