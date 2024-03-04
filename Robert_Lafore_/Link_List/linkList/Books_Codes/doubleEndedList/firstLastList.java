// firstLastList.java
// demonstrates list with first and last references
// to run this program: C>java FirstLastApp
////////////////////////////////////////////////////////////////

class Link {
    public long dData; // data item
    public Link next; // next link in list

    // -------------------------------------------------------------
    public Link(long d) // constructor
    {
        dData = d;
    }

    // -------------------------------------------------------------
    public void displayLink() // display this link
    {
        System.out.print(dData + " ");
    }

    // -------------------------------------------------------------
} // end class Link
////////////////////////////////////////////////////////////////

class FirstLastList {
    private Link first; // ref to first link
    private Link last; // ref to last link

    // -------------------------------------------------------------
    public FirstLastList() // constructor
    {
        first = null; // no links on list yet
        last = null;
    }

    // -------------------------------------------------------------
    public boolean isEmpty() // true if no links
    {
        return first == null;
    }

    // -------------------------------------------------------------
    public void insertFirst(long dd) // insert at the front of the list
    {
        Link newLink = new Link(dd); // make a new link
        if (isEmpty()) // if the list is empty,
            last = newLink; // newLink <-- last
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    // -------------------------------------------------------------
    public void insertLast(long dd) // insert at the end of the list
    {
        Link newLink = new Link(dd); // make a new link
        if (isEmpty()) // if the list is empty,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // old last --> newLink
        last = newLink; // newLink <-- last
    }

    // -------------------------------------------------------------
    public long deleteFirst() // delete the first link
    { // (assumes a non-empty list)
        long temp = first.dData;
        if (first.next == null) // if there is only one item
            last = null; // null <-- last
        first = first.next; // first --> old next
        return temp;
    }

    // -------------------------------------------------------------
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at the beginning
        while (current != null) // until the end of the list,
        {
            current.displayLink(); // print data
            current = current.next; // move to the next link
        }
        System.out.println("");
    }

    // -------------------------------------------------------------
} // end class FirstLastList
////////////////////////////////////////////////////////////////

class FirstLastApp {
    public static void main(String[] args) {
        // make a new list
        FirstLastList theList = new FirstLastList();
        theList.insertFirst(22); // insert at the front
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11); // insert at the rear
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayList(); // display the list
        theList.deleteFirst(); // delete the first two items
        theList.deleteFirst();
        theList.displayList(); // display again
    } // end main()
} // end class FirstLastApp
////////////////////////////////////////////////////////////////

