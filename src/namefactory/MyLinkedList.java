package namefactory;
public class MyLinkedList {
	private Node head;
	
	public void add(String dog) {
		if (head == null) {
			Node node = new Node(dog) ;
			this.head = node;
		} else {
			Node node = new Node(dog) ;
			node.setNext(head);
			this.head = node;
		}
	}
	public boolean contains(String dog) {
		boolean retval = false;
		Node currentNode = head;
		while (currentNode != null) {
			
			if (currentNode.getData().equals(dog)) {
				System.out.println("Got match at: " + dog);
				retval = true;
			}
			currentNode = currentNode.getNext();
		}
		return retval;
	}
	
	
}
