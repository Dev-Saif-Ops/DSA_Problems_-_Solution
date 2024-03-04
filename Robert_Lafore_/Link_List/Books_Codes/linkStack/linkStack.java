////////////////////////////////////////////////////////////////
class Link
{
    public long dData; // data item
    public Link next; // next link in list

    // -------------------------------------------------------------
    public Link(long dd) // constructor
    {
        dData = dd;
    }

    // -------------------------------------------------------------
    public void displayLink() // display ourself
    {
        System.out.print(dData + " ");
    }
} // end class Link
////////////////////////////////////////////////////////////////
class LinkList
{
    private Link first; // ref to first item on list

    // -------------------------------------------------------------
    public LinkList() // constructor
    {
        first = null; // no items on the list yet
    }

    // -------------------------------------------------------------
    public boolean isEmpty() // true if the list is empty
    {
        return (first == null);
    }

    // -------------------------------------------------------------
    public void insertFirst(long dd) // insert at the start of the list
    {
        // make a new link
        Link newLink = new Link(dd);
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    // -------------------------------------------------------------
    public long deleteFirst() // delete the first item
    {
        // (assumes the list is not empty)
        Link temp = first; // save the reference to the link
        first = first.next; // delete it: first-->old next
        return temp.dData; // return the deleted link
    }

    // -------------------------------------------------------------
    public void displayList()
    {
        Link current = first; // start at the beginning of the list
        while (current != null) // until the end of the list,
        {
            current.displayLink(); // print data
            current = current.next; // move to the next link
        }
        System.out.println("");
    }

    // -------------------------------------------------------------
} // end class LinkList
////////////////////////////////////////////////////////////////
class LinkStack
{
    private LinkList theList;

    // -------------------------------------------------------------
    public LinkStack() // constructor
    {
        theList = new LinkList();
    }

    // -------------------------------------------------------------
    public void push(long j) // put an item on the top of the stack
    {
        theList.insertFirst(j);
    }

    // -------------------------------------------------------------
    public long pop() // take an item from the top of the stack
    {
        return theList.deleteFirst();
    }

    // -------------------------------------------------------------
    public boolean isEmpty() // true if the stack is empty
    {
        return (theList.isEmpty());
    }

    // -------------------------------------------------------------
    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }

    // -------------------------------------------------------------
} // end class LinkStack
////////////////////////////////////////////////////////////////
class LinkStackApp
{
    public static void main(String[] args)
    {
        LinkStack theStack = new LinkStack(); // make a stack
        theStack.push(20); // push items
        theStack.push(40);
        theStack.displayStack(); // display the stack
        theStack.push(60); // push items
        theStack.push(80);
        theStack.displayStack(); // display the stack
        theStack.pop(); // pop items
        theStack.pop();
        theStack.displayStack(); // display the stack
    } // end main()
} // end class LinkStackApp
////////////////////////////////////////////////////////////////

