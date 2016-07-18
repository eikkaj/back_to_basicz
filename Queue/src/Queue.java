
public class Queue {
	
	private static int size;
	private static Node head;
	private static Node tail;

	public Queue() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void enqueue(int n) {
		Node node = new Node();
		node.setNum(n);
		
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			node.setNext(this.getTail());
			this.getTail().setPrev(node);
			tail = node;
		}
		size++;
	}
	
	public void dequeue() {
		if (!isEmpty()) {
			head = head.getPrev();
		}
	}
	
	public boolean isEmpty() {
		if (size == 0) return true;
		else return false;
	}
	
	public Node getHead() {	
		return head;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public int getHeadVal() {
		return head.getNum();
	}
	
	public int getTailVal() {
		return tail.getNum();
	}
}
