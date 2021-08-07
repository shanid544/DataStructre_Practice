
public class Stack {

	
	int stack[] = new int[5];
	int top=0;
	public void push(int data) {
		
		if(top>5) {
			System.out.println("stack is full !!!!");
		}
		else {
			stack[top]=data;
			top++;
		}
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
		}
		return data;            //returning the value
		
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
