/*Add a method called median() to the ArrayIns class in the insertSort.java
program (Listing 3.3). This method should return the median value in the
array. (Recall that in a group of numbers half are larger than the median and
half are smaller.) Do it the easy way.  */

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
   
    // make the median method
    public void median(boolean sortArray) {
    	if (sortArray) {    
	    insertionSort(); 
	}

	// Find th median
	if (nElems % 2 != 0) {
	   // for Odd case: Return the middle element
	   System.out.println("Median: " + a[nElems / 2]);
	} else {
	    // for even case: Return the average of the two middle elementd
	    int mid1 = nElems / 2;
	    int mid2 = mid1 - 1;
	    long median = (a[mid1] + a[mid2]) / 2;
  	    System.out.println("Median: " + median);
	}
	
    }

    //--------------------------------------------------------------
} // end class ArrayIns
////////////////////////////////////////////////////////////////

class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100; // array size
        ArrayIns arr; // reference to array
        arr = new ArrayIns(maxSize); // create the array
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
	
	System.out.println("Original Array: ");
        arr.display(); // display items
	
	System.out.println("\nSorting the Array: ");	
        arr.insertionSort(); // insertion-sort them
        arr.display(); // display sorted array
	
	System.out.println("\nCalculating Median: ");
	arr.median(false); // calling median
	
    } // end main()
} // end class InsertSortApp
////////////////////////////////////////////////////////////////

