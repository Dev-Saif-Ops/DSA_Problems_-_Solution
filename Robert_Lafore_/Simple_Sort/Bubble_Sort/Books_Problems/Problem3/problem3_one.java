/* 3.1 In the bubbleSort.java program (Listing 3.1) and the BubbleSort Workshop applet, the in index always goes from left to right, finding the largest item and carrying it toward out on the right. Modify the bubbleSort() method so that it’s bidirectional. This means the in index will first carry the largest item from left to right as before, but when it reaches out, it will reverse an carry the smallest item from right to left. You’ll need two outer indexes, oneon the right (the old out) and another on the left.  */

class ArrayBub {
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
        nElems++; // increment size
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

    // Let's Modify this function as per the requirements.

    public void bubbleSort()
    {
        int out, in;

        // now as per the question we have to make this code bidirectional, so for that purpose we have to reverse the outer loop(out). That means we have to start with nElems - 1 and increase 1 element with each iteration.

        for (out = 0; out < nElems - 1; out++) // outer loop (reversed)
        {
            // now we also have to modify the inner loop, in such a way that we have to split it in two different loops, first which runs from the start of array to out(forward), and second which runs from the end of array to the out(backward).
            
            // Forward loop
            for (in = 0; in < out; in++)  // inner loop (forward)
            {
                if (a[in] > a [in + 1]) // out of order?
                {
                    swap(in, in + 1); // swap them
                }
            }

            // Backward loop
            for (in = nElems - 1; in > out; in--)
            {
                if (a[in] < a[in - 1]) // out of order
                {
                    swap(in, in - 1); // swap them
                }
            }

            // So through this process of modifying outer loop and inner loop we can make our bubble sort bidirectional.
        }
    }

    //-------------------------------------------------

    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

//------------------------------------------------------------------------------------------

class BubbleSortApp {
    public static void main(String[] args)
    {
        int maxSize = 100; // array size
        ArrayBub arr; // reference to array
        arr = new ArrayBub(maxSize); // create the array
        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(5);
        arr.insert(12);
        arr.insert(8);
        arr.insert(3);
        arr.insert(15);
        arr.insert(9);
        arr.insert(7);
        arr.insert(20);
        arr.insert(2);
        arr.insert(10);
        arr.display(); // display items
        arr.bubbleSort(); // bubble sort them
        arr.display(); // display them again
    } // end main()
} // end class BubbleSortApp
////////////////////////////////////////////////////////////////
