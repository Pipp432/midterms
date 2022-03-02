package Stack;

public class Main {
    public static void main(String args[] ) throws Exception{
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        

        UtilityStack.insertFromBottom(3, 35, s);
        while(!(s.isEmpty())){
            System.out.println(s.top());
            s.pop();
        }
    }
}
