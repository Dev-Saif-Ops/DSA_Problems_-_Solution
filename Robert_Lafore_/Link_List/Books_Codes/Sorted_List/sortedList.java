// sortedList.java
// demonstrates sorted list
// to run this program: C>java SortedListApp
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
    public void displayLink() // display this link
    {
        System.out.print(dData + " ");
    }
} // end class Link
////////////////////////////////////////////////////////////////

class SortedList {
    private Link first; // ref to first item on list

    // -------------------------------------------------------------
    public SortedList() // constructor
    {
        first = null;
    }

    // -------------------------------------------------------------
    public boolean isEmpty() // true if no links
    {
        return (first == null);
    }

    // -------------------------------------------------------------
    public void insert(long key) // insert, in order
    {
        Link newLink = new Link(key); // make new link
        Link previous = null; // start at first
        Link current = first;
        // until end of list,
        while (current != null && key > current.dData) { // or key > current,
            previous = current;
            current = current.next; // go to the next item
        }
        if (previous == null) // at the beginning of the list
            first = newLink; // first --> newLink
        else // not at the beginning
            previous.next = newLink; // old prev --> newLink
        newLink.next = current; // newLink --> old current
    } // end insert()

    // -------------------------------------------------------------
    public Link remove() // return & delete the first link
    { // (assumes non-empty list)
        Link temp = first; // save the first
        first = first.next; // delete the first
        return temp; // return the value
    }

    // -------------------------------------------------------------
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at the beginning of the list
        while (current != null) { // until the end of the list,
            current.displayLink(); // print data
            current = current.next; // move to the next link
        }
        System.out.println("");
    }
} // end class SortedList
////////////////////////////////////////////////////////////////

class SortedListApp {
    public static void main(String[] args) {
        // create a new list
        SortedList theSortedList = new SortedList();
        theSortedList.insert(20); // insert 2 items
        theSortedList.insert(40);
        theSortedList.displayList(); // display the list
        theSortedList.insert(10); // insert 3 more items
        theSortedList.insert(30);
        theSortedList.insert(50);
        theSortedList.displayList(); // display the list
        theSortedList.remove(); // remove an item
        theSortedList.displayList(); // display the list
    } // end main()
} // end class SortedListApp
////////////////////////////////////////////////////////////////

