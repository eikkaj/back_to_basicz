public class SingleLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addHead(20);
		list.addHead(50);
		list.addTail(75);
		list.addHead(30);
		list.addHead(20);
		list.addHead(60);
		list.getHead();
		list.size();
		list.print();
		list.getTail();
		list.removeHead();
		list.print();
		list.removeTail();
		list.print();
		list.search(20);
	}

}
