
public class TreeRunner {

	public static void main(String[] args) {
		
		
		Node node= new Node(14);
		
		node.insert(15);
		node.insert(9);
		node.insert(19);
		node.insert(7);
		
		node.printInOrder();
		System.out.println();
		node.printPreOrder();
		System.out.println();
		node.printPostOrder();
		
		

	}

}
