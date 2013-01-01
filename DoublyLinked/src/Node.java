
public class Node {
	
	int num;
	Node next;
	Node prev;
	
	public Node() {
		
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int n) {
		this.num = n;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
