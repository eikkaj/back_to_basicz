public class StackDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(17);
		stack.push(15);
		stack.getSize();
		stack.pop();
		stack.getSize();
		System.out.println(stack.getHead().num);
	}
}
