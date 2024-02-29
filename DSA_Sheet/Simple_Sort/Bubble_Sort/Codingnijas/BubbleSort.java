/* Problem Link: https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms-new/content/662512/offering/10676515?leftPanelTabValue=PROBLEM&customSource=studio_nav */

package Robert_Lafore_Summary.Simple_Sort.Bubble_Sort.Codingnijas;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int size){
        //Your code goes here
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size - i - 1; j++ )
            {
                if(arr[j] > arr[j + 1])
                {
                    //swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
    }
    
}
