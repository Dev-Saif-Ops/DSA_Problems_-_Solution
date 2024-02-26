package Robert_Lafore_Summary.Simple_Sort.Bubble_Sort.My_Practice;

import java.util.Scanner;

public class practiceBs {
    public static void main(String[] args) {
        // take the input for array size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // create an instance of ArrayBub with the given size
        ArrayBub myArray = new ArrayBub(size);

        // take input for array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            long value = sc.nextLong();
            myArray.insert(value);
        }

        // display the original array
        System.out.print("The original array is: ");
        myArray.display();

        // perform bubble sort
        myArray.bubbleSort();

        // display the sorted array
        System.out.print("The sorted array is: ");
        myArray.display();
    }// end class main()
}

//-----------------------------------------------------

class ArrayBub
{
    private long[] a; // ref to array a
    private int nElems; // number of data items

    //-------------------------------------------------

    public ArrayBub(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    //-------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; //increment size
    }

    //-------------------------------------------------

    public void display()  // displays array contents
    {
        for(int j = 0; j < nElems; j++)  // for each element,
        {
            System.out.print(a[j] + " "); // display it
        }
        System.out.println(" ");

    }
    //-------------------------------------------------

    public void bubbleSort()
    {
        int out, in;

        for(out = nElems -1; out > 1; out--) // outer loop (backward)
        {
            for(in = 0; in < out; in++)  // inner loop (forward)
            {
                if(a[in] > a [in + 1]) // out of order?
                {
                    swap(in, in+1); // swap them
                }
                // end bubbleSort()
            }
        }
    }

    //-------------------------------------------------

    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    //-------------------------------------------------   

} // end class ArrayBub
////////////////////////////////////////////////////////
