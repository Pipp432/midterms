package Stack;

import Queues.QueueStack;

public class Main {
    public static void main(String args[] ) throws Exception{
        StackArray s = new StackArray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
        

        // UtilityStack.insertFromBottom(3, 35, s);
        TestStack ts = new TestStack();
        ts.setStack(s);
        s = (StackArray) ts.oddNumbers();
        while(!(s.isEmpty())){
            System.out.println(s.top());
           s.pop();
        }
        s = (StackArray) ts.getStack();
        while(!(s.isEmpty())){
            System.out.println(s.top());
           s.pop();
        }

    }
}
