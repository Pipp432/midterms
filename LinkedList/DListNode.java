package LinkedList;


public class DListNode {
	public int data;
	public DListNode nextNode;
	public DListNode previousNode;

	DListNode(int data) {
		this(data, null, null);
	}

	DListNode(int theElement, DListNode n, DListNode p) {
		data = theElement;
		nextNode = n;
		previousNode = p;
	}

}
