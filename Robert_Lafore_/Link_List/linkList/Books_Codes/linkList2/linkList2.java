class Link {
    public int iData; // data item (key)
    public double dData; // data item
    public Link next; // next link in list

    // -------------------------------------------------------------
    public Link(int id, double dd) // constructor
    {
        iData = id;
        dData = dd;
    }

    // -------------------------------------------------------------
    public void displayLink() // display ourselves
    {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
} // end class Link

////////////////////////////////////////////////////////////////
class LinkList {
    private Link first; // ref to first link on list

    // -------------------------------------------------------------
    public LinkList() // constructor
    {
        first = null; // no links on list yet
    }

    // -------------------------------------------------------------
    public void insertFirst(int id, double dd) { // make a new link
        Link newLink = new Link(id, dd);
        newLink.next = first; // it points to the old first link
        first = newLink; // now first points to this
    }

    // -------------------------------------------------------------
    public Link find(int key) // find link with given key
    { // (assumes a non-empty list)
        Link current = first; // start at 'first'
        while (current.iData != key) // while no match,
        {
            if (current.next == null) // if end of the list,
                return null; // didn't find it
            else // not the end of the list,
                current = current.next; // go to the next link
        }
        return current; // found it
    }

    // -------------------------------------------------------------
    public Link delete(int key) // delete link with given key
    { // (assumes a non-empty list)
        Link current = first; // search for the link
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null)
                return null; // didn't find it
            else {
                previous = current; // go to the next link
                current = current.next;
            }
        } // found it
        if (current == first) // if it's the first link,
            first = first.next; // change the first
        else // otherwise,
            previous.next = current.next; // bypass it
        return current;
    }

    // -------------------------------------------------------------
    public void displayList() // display the list
    {
        System.out.print("List (first-->last): ");
        Link current = first; // start at the beginning of the list
        while (current != null) // until the end of the list,
        {
            current.displayLink(); // print the data
            current = current.next; // move to the next link
        }
        System.out.println("");
    }
    // -------------------------------------------------------------
} // end class LinkList

////////////////////////////////////////////////////////////////
class LinkList2App {
    public static void main(String[] args) {
        LinkList theList = new LinkList(); // make a list
        theList.insertFirst(22, 2.99); // insert 4 items
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        theList.displayList(); // display the list

        Link f = theList.find(44); // find an item
        if (f != null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can't find link");

        Link d = theList.delete(66); // delete an item
        if (d != null)
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Can't delete link");

        theList.displayList(); // display the list
    } // end main()
} // end class LinkList2App
////////////////////////////////////////////////////////////////

