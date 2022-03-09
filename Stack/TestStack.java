package Stack;

public class TestStack {

    MyStack s;
    public void setStack(MyStack s){
        this.s = s;
    }
    public MyStack getStack(){
        return this.s;
    }
    public MyStack oddNumbers() throws Exception{
        if(s==null){
            return null;
        } 
        int size =0;
       StackArray tempOdd = new StackArray();
       StackArray temp = new StackArray();
       StackArray result = new StackArray();
       while(!(s.isEmpty())){
           if(s.top()%2!=0){
               tempOdd.push(s.top());
               temp.push(s.top());
               s.pop();
           }else{
               temp.push(s.top());
               s.pop();
           }
           size++;
           
       }
       for(int i=0;i<size;i++){
           s.push(temp.top());
           temp.pop();


       }
       while(!(tempOdd.isEmpty())){
           result.push(tempOdd.top());
           tempOdd.pop();
       }
       

       return result;
}
}
