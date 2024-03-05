// listInsertionSort.java
// demonstrates sorted list used for sorting
// to run this program: C>java ListInsertionSortApp
////////////////////////////////////////////////////////////////
class Link {
    public long dData; // data item
    public Link next; // next link in list

    // -------------------------------------------------------------
    public Link(long dd) // constructor
    {
        dData = dd;
    }
    // -------------------------------------------------------------
} // end class Link
////////////////////////////////////////////////////////////////

class SortedList {
    private Link first; // ref to the first item on the list

    // -------------------------------------------------------------
    public SortedList() // constructor (no args)
    {
        first = null; // initialize the list
    }
    // -------------------------------------------------------------
    
    public SortedList(Link[] linkArr) // constructor (array as argument)
    {
        first = null; // initialize the list
        for (int j = 0; j < linkArr.length; j++) // copy array to list
            insert(linkArr[j]); // to list
    }
    // -------------------------------------------------------------
    
    public void insert(Link k) // insert (in order)
    {
        Link previous = null; // start at the first
        Link current = first;
        
        // until the end of the list,
        while (current != null && k.dData > current.dData) 
        { // or key > current,
            previous = current;
            current = current.next; // go to the next item
        }
        
        if (previous == null) // at the beginning of the list
            first = k; // first --> k
        else // not at the beginning
            previous.next = k; // old prev --> k
        k.next = current; // k --> old current
    }
    // end insert()
    // -------------------------------------------------------------
    
    public Link remove() // return & delete the first link
    { // (assumes non-empty list)
        Link temp = first; // save the first
        first = first.next; // delete the first
        return temp; // return the value
    }
    // -------------------------------------------------------------
} // end class SortedList
////////////////////////////////////////////////////////////////

class ListInsertionSortApp {
    public static void main(String[] args) {
        int size = 10;
        // create an array of links
        Link[] linkArray = new Link[size];
        
        for (int j = 0; j < size; j++) // fill the array with links
        { // random number
            int n = (int) (java.lang.Math.random() * 99);
            Link newLink = new Link(n); // make link
            linkArray[j] = newLink; // put in array
        }
        // display array contents
        System.out.print("Unsorted array: ");
        
        for (int j = 0; j < size; j++)
            System.out.print(linkArray[j].dData + " ");
        System.out.println("");
        
        // create a new list
        // initialized with the array
        SortedList theSortedList = new SortedList(linkArray);
        
        for (int j = 0; j < size; j++) // links from list to array
            linkArray[j] = theSortedList.remove();
        
        // display array contents
        System.out.print("Sorted Array: ");
        
        for (int j = 0; j < size; j++)
            System.out.print(linkArray[j].dData + " ");
        System.out.println("");
    } // end main()
} // end class ListInsertionSortApp
////////////////////////////////////////////////////////////////

