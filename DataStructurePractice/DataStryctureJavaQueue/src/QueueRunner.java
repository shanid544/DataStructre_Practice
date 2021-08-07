
public class QueueRunner {
	
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enQueue(1);
		queue.enQueue(11);
		queue.enQueue(2);
		queue.enQueue(22);
		
		queue.deQueue();
		queue.deQueue();
		
		queue.enQueue(12);
		queue.enQueue(27);
		
		queue.show();
		
	}

}
