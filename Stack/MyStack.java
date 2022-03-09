package Stack;
public interface MyStack {
	public boolean isEmpty();
	public boolean isFull();
	public void makeEmpty() throws Exception;
	public int top() throws Exception;
	public void pop() throws Exception;
	public void push(int data) throws Exception;
}
