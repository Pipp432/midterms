// This is the test queue implementation
public class TestQueue  {
    public static MyQueue combine(MyQueue q1,MyQueue q2) throws Exception{
       // chack if the reciveing data is null with a guard clause
        if(q1==null||q2==null){
            return null;
        }
        // In the file it said that only queues can be created 
        //so I am assuming implementations can be used too.
        // An array for storing the new queue
        QueueArray result = new QueueArray();
        while(!(q2.isEmpty())){
            // Insert first who ever is lowest value
            if(q2.front()>=q1.front()){
                result.insertLast(q1.front());
                q1.removeFirst();
            }else{
                result.insertLast(q2.front());
                q2.removeFirst();
            }
        }
       // return the queue
        return result;


    }
   
    
}
