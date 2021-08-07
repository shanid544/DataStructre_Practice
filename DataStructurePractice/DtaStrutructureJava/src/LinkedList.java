
public class LinkedList {
	
	 Node head;
	 
	 public void insert(int data) {
		 
		 Node node = new Node();
		 node.data=data;
		 node.next=null;
		 
		 if(head==null) 
		 {
			 head=node;
		 }
		 else
		 {
			 Node n = head;
			 while(n.next!=null) 
			 {
				 n=n.next;
				 
			 }
			 n.next=node;
		 }
		 
	 }
	 
	 public void show() {
		 
		 Node n = head;
		 while(n.next!=null) 
		 {
			 System.out.println(n.data);
			 n=n.next;
			 
		 }
		 System.out.println(n.data);
	 }
	 
	 
	

	public void insertAtStart(int data) {
		Node node =new Node();
		 node.data=data;
		 node.next=null;
		 node.next=head;
		 head=node;
		 
		
	}

	
	public void insertAt(int index,int data) {  //index cannot be zero
		
		if(index==0) {                           //to add start
			insertAtStart(data);
		}
		else {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		
		Node n =head;
		for(int i=0;i<index-1;i++) {   //index cannot be zero
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}		
				
	}
	
	public void  deleteAt(int index) {
		if(index==0) {
			head=head.next;
			
		}
		else {
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1 = n.next;
			n.next =n1.next;  //n1 is deleted
			System.out.println("n1"+" "+"="+" "+n1.data+" "+"is deleted");
			n1=null;  //it is not there in the memmory also, ready for garbage collection
			
		}
	}
}
