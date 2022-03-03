package Stack;

public class TestStack2 {
    public MyStack s1,s2;
    public void swap(int index1 ,int index2) throws Exception{
        // I used stack array but in real exam Stack constructor is given
        StackArray temp = new StackArray();
        int size1=0;
        int size2=0; 
        size1 =  getSize(s1);
        size2 = getSize(s2);
        // Guard Claues
        if(s1.isEmpty()||s2.isEmpty()) return;
        if(index1<0 || index2<0) return;
        if(index1>=size1|| index2>=size2) return; 

       
       


        for(int i = 0; i<index1;i++){
            temp.push(s1.top());
            s1.pop();
        }
        for(int i = 0; i<index2;i++){
            temp.push(s2.top());
            s2.pop();
        }
        int tempSwap = s1.top();
        s1.pop();
        s1.push(s2.top());
        s2.pop();
        s2.push(tempSwap);
        for(int i = 0;i<index2;i++){
            s2.push(temp.top());
            temp.pop();
        } for(int i = 0;i<index1;i++){
            s1.push(temp.top());
            temp.pop();
        }
        

    }
    // Helper method to get the size of the stacks
    private int getSize(MyStack s) throws Exception {
        StackArray temp = new StackArray();
        int size = 0;
        while(!(s.isEmpty())){
            temp.push(s.top());
            s.pop();
            size++;

        }
        while(!(temp.isEmpty())){
            s.push(temp.top());
            temp.pop();
            

        }

       
        return size;
    }
    public static void main(String args[]) throws Exception {
        TestStack2 ts = new TestStack2();
        // Again these are just to have stacks in exams use the Stack() constructors
        ts.s1 = new StackArray();
        ts.s2 = new StackArray();
        ts.s1.push(10);
        ts.s1.push(20);
        ts.s1.push(30);
        ts.s1.push(40);
        ts.s2.push(70);
        ts.s2.push(80);
        ts.s2.push(90);
        ts.s2.push(100);
        ts.swap(4, 3);
        System.out.println("Stack 1");
        while(!(ts.s1.isEmpty())){
            System.out.println(ts.s1.top());
            ts.s1.pop();
        }
        System.out.println("======================");
        System.out.println("Stack 2");
        while(!(ts.s2.isEmpty())){
            System.out.println(ts.s2.top());
            ts.s2.pop();
        }
    }
}
