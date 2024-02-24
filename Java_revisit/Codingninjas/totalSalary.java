/* Problem Link: https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120302/offering/1461354?leftPanelTabValue=PROBLEM&customSource=studio_nav */

import java.util.* ;

import java.io.*;



class Solution {



    public static void main(String args[]) {



        // Write code here

        Scanner sc= new Scanner(System.in);

        float basic= sc.nextInt();

        char ch=sc.next().charAt(0);

        float allow;

        float hra=(basic)*20/100;

        float da=(basic)*50/100;

        float pf=(basic)*11/100;

        if(ch=='A'){

             allow=1700;

        }

        else if(ch=='B'){

            allow=1500;

        }

        else{

            allow=1300;

        }



        float totalSalary=basic+hra+da+allow-pf;

        System.out.println(Math.round(totalSalary));



    }

}

