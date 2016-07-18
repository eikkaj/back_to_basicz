
public class QueueDriver {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		System.out.println("Head: " + q.getHeadVal());
		System.out.println("Tail: " + q.getTailVal());
		q.enqueue(17);
		System.out.println("Head: " + q.getHeadVal());
		System.out.println("Tail: " + q.getTailVal());
		q.dequeue();
		System.out.println("Head: " + q.getHeadVal());
		System.out.println("Tail: " + q.getTailVal());
	}

}
