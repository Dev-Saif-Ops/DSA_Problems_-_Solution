package Robert_Lafore_Summary.Simple_Sort.Selection_Sort.My_Practise;

import java.util.Scanner;

public class practiseSelectionSort {
    public static void main(String[] args) {
        // take the input for array size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // create an instance of ArraySel with the given size
        ArraySel myArray = new ArraySel(size);

        // take input for array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            long value = sc.nextLong();
            myArray.insert(value);
        }

        // display the original array
        System.out.print("The original array is: ");
        myArray.display();

        // perform Selection sort
        myArray.selectionSort();

        // display the sorted array
        System.out.print("The sorted array is: ");
        myArray.display();
    }// end class main()
}

//-----------------------------------------------------

class ArraySel {
    private long[] a; // ref to array a
    private int nElems; // number of data items

    //--------------------------------------------------

    public ArraySel(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    //--------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    //--------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println();
    }

    //--------------------------------------------------

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) // outer loop
        {
            min = out; // minimum
            for (in = out + 1; in < nElems; in++) // inner loop
                if (a[in] < a[min]) // if min greater,
                    min = in; // we have a new min
            swap(out, min); // swap them
        } // end for(out)
    } // end selectionSort()


    //--------------------------------------------------

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
} // end class ArraySel
//////////////////////////////////////////////////////