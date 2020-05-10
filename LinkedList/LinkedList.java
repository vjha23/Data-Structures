// Java program to traversal the singly linked list
public class LinkedList {
	Node head; // head of the list
	// Linked list node . This inner class is made static so that main() can acess to it
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	// this function prints contents of linked list strutcures from head
	public void printList() {
		Node n=head; // here n is temp
		while(n!=null) {
			System.out.println(n.data+ " ");
			n=n.next;
		}
	}
	// Method to create a simple linked list with 3 nodes
	public static void main(String[] args) {
		// Start with empty list
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		list.head.next=second; // list first node with the second node
		second.next=third; // link second node with third
		list.printList();
	}
}
