package Queues;

import Stack.MyStack;
import Stack.StackArray;

public class QueueStack implements MyQueue {
    public MyStack s1;
    
    private MyStack s2;
    // Note this isn't in the midterm papers but ajarn mentioned it in class
    // s1 will be used to stored the data and s2 will be a temp Stack

    // constructor
    public QueueStack(MyStack s1){
        this.s1 = s1;
        this.s2 = new StackArray();

    }
    // For no parameter constructor calls
    public QueueStack(){
        this.s1 = new StackArray();
        this.s2 = new StackArray();

    }

    @Override
    public int front() throws Exception {
        if(s1.isEmpty()){
            throw new EmptyQueueException();
        }
        return s1.top();
    }

    @Override
    public int back() throws Exception {
        if(s1.isEmpty()){
            throw new EmptyQueueException();
        }
        // reverse the stack
       while(!s1.isEmpty()){
           s2.push(s1.top());
           s1.pop();
       }
       // the top of temp stack is returned
       int back = s2.top();
       // put everything back into the data stack
       while(!s2.isEmpty()){
        s1.push(s2.top());
        s2.pop();
       }
        return back;
    }

    @Override
    public int removeFirst() throws Exception {
        if(s1.isEmpty()) throw new EmptyQueueException();
        int first = s1.top();
        s1.pop();
        return first;
    }

    @Override
    public void insertLast(int data) throws Exception {
        while(!s1.isEmpty()){
            s2.push(s1.top());
            s1.pop();
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.top());
            s2.pop();
           }
        
    }

    @Override
    public boolean isEmpty() {
        
        return s1.isEmpty();
    }

    @Override
    public boolean isFull() {
        
        return s1.isFull();
    }

    @Override
    public int size() throws Exception {
        int counter = 0;
        while(!s1.isEmpty()){
            s2.push(s1.top());
            s1.pop();
            counter++;
        }
        while(!s2.isEmpty()){
            s1.push(s2.top());
            s2.pop();
        }
        
        return counter;
    }

    
}
