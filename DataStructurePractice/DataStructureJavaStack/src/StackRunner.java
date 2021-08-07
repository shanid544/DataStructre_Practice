
public class StackRunner {

	public static void main(String[] args) {
		
		DStack dstack = new DStack();
		
		dstack.push(1);
		dstack.show();
		dstack.push(2);
		dstack.show();
		dstack.push(3);
		dstack.show();
		dstack.push(4);
		dstack.show();
		dstack.push(5);
		dstack.show();
		dstack.push(6);
		dstack.show();
		dstack.push(7);
		dstack.show();
		dstack.push(8);
		dstack.show();
		
		System.out.println(dstack.pop());
		dstack.show();
		System.out.println(dstack.pop());
		dstack.show();
		System.out.println(dstack.pop());
		dstack.show();
		System.out.println(dstack.pop());
		dstack.show();
		System.out.println(dstack.pop());
		dstack.show();
		System.out.println(dstack.pop());
		dstack.show();
		
		/*
		 * Stack stack = new Stack(); System.out.println("empty is "+stack.isEmpty());
		 * 
		 * stack.push(15); stack.push(12);
		 * 
		 * System.out.println("peek"+" "+stack.peek()); stack.push(155); stack.push(21);
		 * stack.push(9);
		 * 
		 * System.out.println("empty is "+stack.isEmpty());
		 * 
		 * System.out.println("size is "+ stack.size());
		 * 
		 * stack.show();
		 * 
		 * System.out.println("pop"+" "+stack.pop());
		 * System.out.println("size after pop "+ stack.size());
		 */
	}

}
