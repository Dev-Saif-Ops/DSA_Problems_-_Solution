/* Problem Link:  https://www.codingninjas.com/studio/problems/bubble-sort_980524?leftPanelTabValue=PROBLEM*/

package Robert_Lafore_Summary.Simple_Sort.Bubble_Sort.DSA_Sheet;

public class bubbleSort {
    public static void bubbleSort(int[] arr, int n) {   
        // Write your code here.
        int i, j, temp;
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n - i - 1; j++ )
            {
                if(arr[j] > arr[j + 1])
                {
                    //swap the elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    
}
