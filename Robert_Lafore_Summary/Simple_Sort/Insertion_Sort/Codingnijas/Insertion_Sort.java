/* Problem Link: https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms-new/content/662512/offering/10676517?leftPanelTabValue=PROBLEM&customSource=studio_nav */

package Robert_Lafore_Summary.Simple_Sort.Insertion_Sort.Codingnijas;

//---------------------------------------------------------

public class Insertion_Sort {  

    public static void insertionSort(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        int i, j, x;

        //loop for repeating passes
        for(i = 1; i < n; i++)
        {
            //pointer from where shifting is started
            j = i - 1;

            //elment where i is pointing
            x = arr[i];
            
            //go on shifting the element as long as arr[j] is greater than x
            //continue as long as j > -1
            while(j > -1 && arr[j] > x)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            
            //element should be inserted here
            arr[j + 1] = x;
        }
    }

}