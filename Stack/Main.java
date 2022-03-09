package Stack;

import LinkedList.CDLinkedList;
import LinkedList.*;

public class Main {
    public static void main(String args[] ) throws Exception{
        StackLinkedList s = new StackLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        CDLinkedList list = s.getTheList();
        int k = 0;
        int j = 0;
        System.out.println("=================== Linked List Index ======================");
        DListIterator it = new DListIterator(list.header);
        it.next();
        while(it.currentNode!=list.header){
            System.out.println("Index: "+k+" value: "+it.currentNode.data);
            it.next();
            k++;

        }
       
        System.out.println("=================== Stack Index ======================");
         while(!(s.isEmpty())){
            System.out.println("index: "+j+" value: "+s.top());
            j++;
           s.pop();
        }
        
        // StackQueue sq = new StackQueue();
        // sq.push(2);
        // sq.push(10);
        // sq.push(11);
        // sq.push(12);
        // sq.push(100);     
        // System.out.println("Size: "+sq.size());
        // while(!(sq.isEmpty())){
        //     System.out.println(sq.top());
        //     sq.pop();
        // }
   
        

        // UtilityStack.insertFromBottom(3, 35, s);
        // TestStack ts = new TestStack();
        // ts.setStack(s);
        // s = (StackArray) ts.oddNumbers();
        // while(!(s.isEmpty())){
        //     System.out.println(s.top());
        //    s.pop();
        // }
        // s = (StackArray) ts.getStack();
        // while(!(s.isEmpty())){
        //     System.out.println(s.top());
        //    s.pop();
        // }

    }
}
