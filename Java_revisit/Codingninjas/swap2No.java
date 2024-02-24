/* Problem Link: https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120300/offering/1459165?leftPanelTabValue=PROBLEM&customSource=studio_nav */

public class Solution{
    public static void swapNumber(int[] a, int[] b) {
        // Write your code here.
        int i,temp;

        for(i=0; i<a.length && i<b.length; i++){

            temp = a[i];

            a[i] = b[i];

            b[i] = temp;

        }
    }

}
