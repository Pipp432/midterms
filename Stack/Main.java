package Stack;

public class Main {
    public static void main(String args[] ) throws Exception{
        StackArray s = new StackArray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int[] array  = s.getTheArray();
        int k = 0;
        int j = 0;
        System.out.println("=================== Array Index ======================");
        for (int i : array) {
            System.out.println("index: "+k+" value: "+i);
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
