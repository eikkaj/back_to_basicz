
public class Stack {
	private static int size;
	private static Node head;
	
	public Stack() {
		head = null;
		size = 0;
	}
	
	public void getSize() {
		System.out.println(size);
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void push(int n) {
		Node z = new Node();
		z.setNum(n);
		z.setNext(head);
		head = z;
		size++;
	}
	
	public void pop() {
		if (!isEmpty()) head = head.getNext();
		size--;
	}
	
	public Node getHead() {
		return head;
	}
}
