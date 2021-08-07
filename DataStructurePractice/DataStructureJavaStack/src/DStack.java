
public class DStack {
	
	int capacity=2;
	int stack[] = new int[capacity];
	int top=0;
	public void push(int data) {
		
		if(size()==capacity) {
			expand();
		}
		else {
			stack[top]=data;
			top++;
		}
	}
	private void expand() {
		
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity *=2;
		
	}
	public void show() {
		
		for(int n: stack) {
			System.out.print(n +" ");
		}
		System.out.println(); 
	}
	public int pop() {
		
		int data=0;
		if(isEmpty()) {
			System.out.println("stack is empty !!!");
			
		} 
		else {
			top--;               //top always point a empty space above the topmost element in the stack array. thats why we reducing one value 
			data = stack[top];    //now top points the top most element in the stack array
			stack[top]=0;             //making that top most elemeny zero
			shrink();
		}
		return data;            //returning the value
		
	}	
	private void shrink() {
		int length = size();
		if(length<=(capacity/2)/2){
			capacity = capacity/2;
		}
		 int newStack[] = new int[capacity];
		 System.arraycopy(stack, 0, newStack, 0, length);
		 stack = newStack;
	}
	public int peek() {
		int data;
		
		data = stack[top-1];
		
		return data;
		
		
	}
	
	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top<=0;
	}
	

}
