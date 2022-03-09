package Queues;


public class PriorityQueue {
	MyQueue q;

	public PriorityQueue(MyQueue q) {
		super();
		this.q = q;
	}

	// implement this.
	public void push(int x) throws Exception {
		if(q.isEmpty()) {
			q.insertLast(x);
			return;
		}
		int index = 0;
		int size = q.size();
		int temp = q.removeFirst();
		
		// while the values inside the queue are less than x remove them and put them back at the end or while 
		//the index is less than the total size
		
		while(x>temp && index<size) {
			q.insertLast(temp);
			temp = q.removeFirst();
			index++;
		}
		//These if statement look at why the loop breaks
		// if the index is equal to size meaning that all data in the queue is less than x 
		// then insert x and the least value data then remove the front values and insert them last to preserve the order 
		// This will make x be last in the queue
		
		
			if(index == size) {
				q.insertLast(x);
				q.insertLast(temp);
				for(int j = 0;j<size;j++) {
					q.insertLast(q.removeFirst());
				}
			}
			// If the loop breaks due to a data inside is more than x then insert x and the data that was larger
			// then since the priority queue is sorted remove the remaining data which are larger than the data that 
			// broke the loop and insert them into the back 
			else {
				q.insertLast(x);
				q.insertLast(temp);
				for(int k = index+1;k<size;k++) {
					q.insertLast(q.removeFirst());
				}
			}
		}


	

	// implement this.
	public void pop() throws Exception {
		if(q.isEmpty()) {
			throw new EmptyQueueException();
		}else {
			q.removeFirst();
			
		}
		
	


	}

	// implement this
	public int top() throws Exception {
		if(q.isEmpty()) {
			throw new EmptyQueueException();
		}
		return q.front();


	}

}
