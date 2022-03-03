package Queues;

public class TestQueue2 {
    MyQueue q1, q2;
    // q1 12 345
    // q2 678 9+

    // 2,
    public void crossOver(int p1, int p2) throws Exception{
        int size1 = q1.size()-p1; //5
        int size2 = q2.size()-p2; //5
        for(int i= 0; i<p1;i++){
            q1.insertLast(q1.removeFirst());
        }
        for(int i= 0; i<p2;i++){
            q2.insertLast(q2.removeFirst());
        }
        for(int i= 0; i<size1;i++){
            q2.insertLast(q1.removeFirst());
        }
        for(int i= 0; i<size2;i++){
            q1.insertLast(q2.removeFirst());
        }
      
        
    }

    public static void main(String args[]) throws Exception{
        QueueArray q1 = new QueueArray();
        QueueArray q2 = new QueueArray();
        q1.insertLast(1);
        q1.insertLast(2);
        q1.insertLast(3);
        q1.insertLast(4);
        q1.insertLast(5);

       
        q2.insertLast(6);
        q2.insertLast(7);
        q2.insertLast(8); 
        q2.insertLast(9);
        q2.insertLast(10);
        TestQueue2 tq = new TestQueue2();
        tq.q1 = q1;
        tq.q2 = q2;
        tq.crossOver(2, 3);
        System.out.println("Q1 ========================");
        while(!(tq.q1.isEmpty())){
            System.out.println(tq.q1.removeFirst());
        }
        System.out.println("Q2 ========================");
        while(!(tq.q2.isEmpty())){
            System.out.println(tq.q2.removeFirst());
        }


        
    }

}
