package Stack;

import Queues.EmptyQueueException;
import Queues.MyQueue;
import Queues.QueueArray;


public class StackQueue implements MyStack{
    private MyQueue q1;

    public StackQueue(){
        this.q1 = new QueueArray();
    }

    public StackQueue(QueueArray q1){
        this.q1 = q1;
    }

    @Override
    public boolean isEmpty() {
        
        return q1.isEmpty();
    }

    @Override
    public boolean isFull() {
        
        return q1.isFull();
    }

    @Override
    public void makeEmpty() throws Exception {
        while(!q1.isEmpty()){
            q1.removeFirst();
        
        }
        
    }

    @Override
    public int top() throws Exception {
        if(q1.isEmpty()) throw new EmptyQueueException();
        
        return q1.front();
    }

    @Override
    public void pop() throws Exception {
        if(q1.isEmpty()){
            throw new EmptyQueueException();
        }
        q1.removeFirst();
        
    }

    @Override
    public void push(int data) throws Exception {
        int size = q1.size();
        q1.insertLast(data);
        for(int i=0;i<size;i++){
            q1.insertLast(q1.removeFirst());

        }
        
    }
    public int size() throws Exception{
        if(q1.isEmpty()) return 0;
        int counter =1;
        int temp=q1.front();
        q1.insertLast(q1.removeFirst());

        while(temp!=q1.front()&& !q1.isEmpty()){
            q1.insertLast(q1.removeFirst());
            counter++;

        }
        return counter;
    }

    
}
