/**
 * 
 */
package linklist;

/**
 * @author garvitkhandelwal
 * @since 11-Dec-2022
 */
public class LinkedList<T> {

	Node head;

	public LinkedList() {
		head = null;
	}

	class Node {

		T data;
		Node next;

		/**
		 * Constructor
		 * 
		 * @param data object
		 */
		public Node(T data) {
			this.data = data;
			next = null;
		}

	}

	/**
	 * Add element at last position
	 * 
	 * @param obj
	 */
	private void addLast(T obj) {

		Node node = new Node(obj);
		Node current = head;
		if (current == null) {
			head = node;
			return;
		}
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
	}

	
	/**
	 * Add element at last position
	 * 
	 * @param obj
	 */
	private void addFirst(T obj) {

		Node node = new Node(obj);
		node.next = head;
		head = node;
	}

	/**
	 * Delete an element in linkedlist
	 * @param obj
	 */
	private void delete(T obj) {

		Node current = head;
		if (current == null) {
			System.out.println("Not found");
			return;
		}

		if (current.data.equals(obj)) {
			head = current.next;
			return;
		}

		Node previous = current;
		current = current.next;

		while (current.next != null) {

			if (current.data.equals(obj)) {
				previous.next = current.next;
				current = null;
				return;
			}
		}

		System.out.println("Not found");

	}

	private void print() {
		Node current = head;
		if (current == null) {
			System.out.println("null");
			return;
		}
		while (current != null) {
			System.out.println(current.data.toString());
			current = current.next;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<String> linklist = new LinkedList<String>();
		linklist.addLast("Name");
		linklist.addLast("Name1");
		linklist.addLast("Name2");
		linklist.addLast("Name3");
		linklist.print();

		linklist.delete("Name1");
		linklist.print();

	}

}
