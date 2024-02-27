package Robert_Lafore_.Stack_and_Queues.Book_Codes;

// brackets.java
// stacks used to check matching brackets
// to run this program: C>java BracketsApp
import java.io.*; // for I/O

////////////////////////////////////////////////////////////////
class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    // Constructor
    public StackX(int s) {
        maxSize = s;
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
class BracketChecker {
    private String input;

    // Constructor
    public BracketChecker(String in) {
        input = in;
    }

    public void check() {
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '('))
                            System.out.println("Error: " + ch + " at " + j);
                    } else
                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default:
                    break;
            } // end switch
        } // end for

        if (!theStack.isEmpty())
            System.out.println("Error: missing right delimiter");
    } // end check()
} // end class BracketChecker

////////////////////////////////////////////////////////////////
class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;

            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
} // end class BracketsApp
////////////////////////////////////////////////////////////////
