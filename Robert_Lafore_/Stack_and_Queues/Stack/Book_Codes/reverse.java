package Robert_Lafore_.Stack_and_Queues.Book_Codes;

// reverse.java
// stack used to reverse a string
// to run this program: C>java ReverseApp
import java.io.*; // for I/O
////////////////////////////////////////////////////////////////
class StackY {
    private int maxSize;
    private char[] stackArray;
    private int top;

    // Constructor
    public StackY(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    // Put item on top of stack
    public void push(char j) {
        stackArray[++top] = j;
    }

    // Take item from top of stack
    public char pop() {
        return stackArray[top--];
    }

    // Peek at top of stack
    public char peek() {
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
} // end class StackX
////////////////////////////////////////////////////////////////

class Reverser {
    private String input;
    private String output;

    // Constructor
    public Reverser(String in) {
        input = in;
    }

    // Reverse the string
    public String doRev() {
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStack.push(ch);
        }

        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
} // end class Reverser
////////////////////////////////////////////////////////////////

class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();

            if (input.equals("")) {
                break;
            }

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: " + output);
        }
    }

    // Read a string from user input
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
} // end class ReverseApp
////////////////////////////////////////////////////////////////
