
public class Node {
	
	//Node in singly linked list consists of the node, in this case an int and the pointer
	int nodeNum;
	Node next;
	
	public Node() {
		
	}
	
	public Node(int nodeNum, Node next) {
		this.nodeNum=nodeNum;
		this.next=next;
	}
	
	public int getNum() {
		return nodeNum;
	}
	
	public void setNum(int n) {
		this.nodeNum = n;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
