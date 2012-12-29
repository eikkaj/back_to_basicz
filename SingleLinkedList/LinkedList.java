
public class LinkedList {

	private static Node head;
	private static int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public void size() {
		System.out.println("***Linked List Size***");
		System.out.println(size);
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	//Add to head
	public void addHead(int n) {
		Node z = new Node();
		z.setNum(n);
		if (isEmpty()) {
			System.out.println("Adding node to head, " + n);
			head = z;
		} else {
			z.setNext(head);
			head = z;
		}
		size++;
	}
	
	public void getHead() {
		System.out.println(head.getNum());
	}
	
	//Add to tail
	public void addTail(int n) {
		Node z = new Node();
		z.setNum(n);
		z.setNext(null);
		if (isEmpty()) {
			head = z;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(z);
		}
		size++;
	}
	
	public void getTail() {
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		System.out.print("***Tail Is: ");
		System.out.println(current.getNum() + "***");
	}
	
	//Remove from head
	public void removeHead() {
		if (size < 2) {
			head.setNext(null);
		} else {
			Node cache = head.getNext();
			head.setNext(null);
			head = cache;
		}
		size--;
	}
	
	//Remove from tail
	public void removeTail() {
		if (isEmpty()) {
			return;
		} else {
			Node current = head;
			while (current.getNext().getNext() !=null) {
				current = current.getNext();	
			}
			current.setNext(null);
		}
		size--;
	}
	
	//Search for specific node
	public void search(int n) {
		Node current = head;
		if (current.getNum() == n) {
			System.out.println("Found [" + current.getNum() + "]");
		}
		while (current.getNext() != null) {
			current = current.getNext();
			if (current.getNum() == n) {
				System.out.println("Found [" + current.getNum() + "]");
			}
		}
	}
	
	//printed linkedlist
	public void print() {
		System.out.println("***Printing the linkedlist***");
		System.out.println();
		Node current = head;
		while (current != null) {
			System.out.print("[" + current.getNum() + "]->");
			current = current.getNext();
		}
		System.out.println("NULL");
	}

}
