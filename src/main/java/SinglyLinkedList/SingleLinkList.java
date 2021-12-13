package SinglyLinkedList;

public class SingleLinkList {

	Node head;

	class Node {

		int data;
		Node next;

		// constructor
		public Node(int d) {
			data = d;
		}
	}

		public void InsertLast(SingleLinkList list, int data) {
			Node newNode = new Node(data);
			if (list.head == null) {
				list.head = newNode;
			} else {

				Node last = list.head;
				while (last.next != null) {

					last = last.next;

				}
				last.next = newNode;
			}

		}

		public void PrintNodes(SingleLinkList list) {
			Node currNode = list.head;
			while (currNode != null) {
				System.out.println(currNode.data);
				currNode = currNode.next;
			}

		}

	
	public static void main(String[] args) {
		SingleLinkList ll=new SingleLinkList();
		
		ll.InsertLast(ll, 1);
		ll.PrintNodes(ll);
		
	}
}
