package java_linked_list;

public class Node {
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	public void appendToTail(int newVal) {
		Node end = new Node(newVal);
		Node temp = this;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = end;
	}
}
