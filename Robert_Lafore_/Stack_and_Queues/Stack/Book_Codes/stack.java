package Robert_Lafore_.Stack_and_Queues.Book_Codes;

// stack.java
// demonstrates stacks
// to run this program: C>java StackApp
////////////////////////////////////////////////////////////////
class StackZ {
    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack

    // Constructor
    public StackZ(int s) {
        maxSize = s; // set array size
        stackArray = new long[maxSize]; // create array
        top = -1; // no items yet
    }

    // Put item on top of stack
    public void push(long j) {
        stackArray[++top] = j; // increment top, insert item
    }

    // Take item from top of stack
    public long pop() {
        return stackArray[top--]; // access item, decrement top
    }

    // Peek at top of stack
    public long peek() {
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
} // end class StackX
////////////////////////////////////////////////////////////////

class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10); // make new stack
        theStack.push((char) 20); // push items onto stack
        theStack.push((char) 40);
        theStack.push((char) 60);
        theStack.push((char) 80);

        while (!theStack.isEmpty()) { // until it’s empty,
            long value = theStack.pop(); // delete item from stack
            System.out.print(value + " "); // display it
        } // end while
        System.out.println("");
    } // end main()
} // end class StackApp
