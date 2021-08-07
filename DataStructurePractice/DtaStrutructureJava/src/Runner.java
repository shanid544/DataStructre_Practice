
//For internal implimentation
//import java.util.LinkedList;


public class Runner {

	public static void main(String[] args) {
		
		
		   //internal implimentation
		  //LinkedList list = new LinkedList();
		  //list.add(5);
		  //list.add(3, 12);
		
		
		LinkedList list = new LinkedList();
		list.insert(14);
		list.insert(47);
		list.insert(67);
		list.insertAtStart(15);
		list.insertAt(0,33);
		list.deleteAt(2);
		list.show();
		

	}

}
