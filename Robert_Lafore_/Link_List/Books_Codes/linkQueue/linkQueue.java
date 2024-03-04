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
    private Link first; // ref to first item
    private Link last; // ref to last item

    // -------------------------------------------------------------
    public FirstLastList() // constructor
    {
        first = null; // no items on list yet
        last = null;
    }

    // -------------------------------------------------------------
    public boolean isEmpty() // true if no links
    {
        return first == null;
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
    {
        // (assumes non-empty list)
        long temp = first.dData;
        if (first.next == null) // if there is only one item
            last = null; // null <-- last
        first = first.next; // first --> old next
        return temp;
    }

    // -------------------------------------------------------------
    public void displayList() {
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

class LinkQueue {
    private FirstLastList theList;

    // --------------------------------------------------------------
    public LinkQueue() // constructor
    {
        theList = new FirstLastList(); // make a 2-ended list
    }

    // --------------------------------------------------------------
    public boolean isEmpty() // true if the queue is empty
    {
        return theList.isEmpty();
    }

    // --------------------------------------------------------------
    public void insert(long j) // insert at the rear of the queue
    {
        theList.insertLast(j);
    }

    // --------------------------------------------------------------
    public long remove() // remove from the front of the queue
    {
        return theList.deleteFirst();
    }

    // --------------------------------------------------------------
    public void displayQueue() {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
    // --------------------------------------------------------------
} // end class LinkQueue
////////////////////////////////////////////////////////////////

class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue theQueue = new LinkQueue();
        theQueue.insert(20); // insert items
        theQueue.insert(40);
        theQueue.displayQueue(); // display the queue
        theQueue.insert(60); // insert items
        theQueue.insert(80);
        theQueue.displayQueue(); // display the queue
        theQueue.remove(); // remove items
        theQueue.remove();
        theQueue.displayQueue(); // display the queue
    } // end main()
} // end class LinkQueueApp
////////////////////////////////////////////////////////////////

