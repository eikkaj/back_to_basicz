
public class Queue {
	
	private static int size;
	private static Node head;

	public Queue() {
		head = null;
		size = 0;
	}
	
	public void enqueue(Node node) {
		if (isEmpty()) head = node;
		size++;
	}
	
	public void dequeue() {
		
	}
	
	public boolean isEmpty() {
	
		return false;
	}
	
	public Node getHead() {
		
		return head;
	}
}
