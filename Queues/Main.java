package Queues;

class Main{
    public static void main(String args[] ) throws Exception{
        QueueArray q1 = new QueueArray();
        QueueArray q2 = new QueueArray();
        q1.insertLast(1);
        q1.insertLast(3); 
        q1.insertLast(5); 
        q1.insertLast(7); 
        q1.insertLast(9);
        
        q2.insertLast(2);
        q2.insertLast(10);
        q2.insertLast(42);
        q2.insertLast(63);
        // I am using queueArray to print out the whole using an overrided toString method
        QueueArray resultArray= (QueueArray) TestQueue.combine(q1, q2);
        System.out.println(resultArray.toString());

    }
}