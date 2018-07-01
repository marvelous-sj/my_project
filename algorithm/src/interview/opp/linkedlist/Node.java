package interview.opp.linkedlist;

public class Node<T> {
	private final T value;
	private Node<T> next;
	
	public Node(T value) {
		this.value = value;
		this.next=null;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	
}
