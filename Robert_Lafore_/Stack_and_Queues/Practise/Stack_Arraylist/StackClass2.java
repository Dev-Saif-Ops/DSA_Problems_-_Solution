/* This problem is same as previous one but the difference is here we are solving it with the help of java collection tools and liberaries. */

package Robert_Lafore_.Stack_and_Queues.Practise.Stack_Arraylist;

import java.util.Stack;

public class StackClass2 {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
