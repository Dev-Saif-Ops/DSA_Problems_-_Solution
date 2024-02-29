package Robert_Lafore_Summary.Simple_Sort.Insertion_Sort;

import java.util.Scanner;

public class practiseIs {
    public static void main(String[] args) {
        // take the input for array size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // create an instance of ArrayBub with the given size
        ArrayIns myArray = new ArrayIns(size);

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
        myArray.insertionSort();

        // display the sorted array
        System.out.print("The sorted array is: ");
        myArray.display();
    }// end class main()
    
}

//--------------------------------------------------------------
class ArrayIns {
    private long[] a; // ref to array a
    private int nElems; // number of data items

    //--------------------------------------------------------------
    public ArrayIns(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    //--------------------------------------------------------------
    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    //--------------------------------------------------------------
    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    }

    //--------------------------------------------------------------
    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) // out is dividing line
        {
            long temp = a[out]; // remove marked item
            in = out; // start shifts at out
            while (in > 0 && a[in - 1] >= temp) // until one is smaller,
            {
                a[in] = a[in - 1]; // shift item to right
                --in; // go left one position
            }
            a[in] = temp; // insert marked item
        } // end for
    } // end insertionSort()

    //--------------------------------------------------------------
} // end class ArrayIns
////////////////////////////////////////////////////////////////
