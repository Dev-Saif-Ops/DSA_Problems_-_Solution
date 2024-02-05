/*
Problem Link: https://www.codingninjas.com/studio/problems/switch-case-statement_8357244?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

 Important Note: In Python, there is no built-in switch statement like in some other programming languages. So, thats why i am writing this code in Java.
 */

 public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        switch(ch)
        {
            case 1:
                double areaOfCircle = Math.PI*(a[0]*a[0]);
                return areaOfCircle;
            case 2:
                double square = a[0]*a[1];
                return square;
        }
        return 0;
    }
}