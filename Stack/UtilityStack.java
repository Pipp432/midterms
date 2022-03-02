package Stack;

public class UtilityStack {
    public static void insertFromBottom(int p, int value,MyStack s) throws Exception{
        StackArray temp = new StackArray();
        int sizeOfStack=0;
        // Since the Utility Stack doesn't have a size property we count the number of element manually
        
        while(!(s.isEmpty())){
            temp.push(s.top());
            s.pop();
            sizeOfStack++;
        } while(!(temp.isEmpty())){
            s.push(temp.top());
            temp.pop();
            
        }
        for(int i =0;i<sizeOfStack-p;i++){
            temp.push(s.top());
            s.pop();
        }
        s.push(value);
        for(int i =0;i<sizeOfStack-p;i++){
           s.push(temp.top());
            temp.pop();
        }
    }
}
