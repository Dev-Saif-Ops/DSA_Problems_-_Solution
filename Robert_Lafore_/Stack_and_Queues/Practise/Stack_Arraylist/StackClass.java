package Robert_Lafore_.Stack_and_Queues.Practise.Stack_Arraylist;

import java.util.*;

public class StackClass {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

//-------------------------------------------------------------------------

    static class Stack {
        // make a ArrayList
        static ArrayList <Integer> list = new ArrayList<>();

        //-------------------------------------------------------------------------
        //function isEmpty
        public static boolean isEmpty()
        {
            return list.size() == 0;
        }

        //-------------------------------------------------------------------------
        //function push
        public static void push(int data)
        {
            list.add(data);
        }

        //-------------------------------------------------------------------------
        // fundtion pop
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //-------------------------------------------------------------------------
        //function peek
        public static int peek()
        {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    
}
