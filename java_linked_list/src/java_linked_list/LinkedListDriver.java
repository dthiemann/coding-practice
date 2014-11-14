package java_linked_list;

public class LinkedListDriver {
	
	public static void printLinkedList(Node head) {
		Node cur = head;
		while (cur != null) {
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
		System.out.print("\n");
	}
	
	public static void removeHead(Node head) {
		head.value = head.next.value;
		head.next = head.next.next;
	}
	
	public static void main(String args[]) {
		Node head = new Node(12);
		head.appendToTail(14);
		head.appendToTail(1);
		head.appendToTail(345);
		
		printLinkedList(head);
		removeHead(head); 
		printLinkedList(head);
	}
}
