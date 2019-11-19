package namefactory;
public class Node {
	Node next;
	String data;

	public Node(String dog) {
		this.data = dog;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}
}
