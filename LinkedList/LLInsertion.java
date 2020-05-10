
public class LLInsertion {
	Node head;
	
	// Linked list node
	 class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	 }
		// Insert a new node at the begning
			public void push(int new_data) {
				Node new_node=new Node(new_data);
				new_node.next=head; // make next of newnode as head
				head=new_node; // move the head to point to the new node
			}
		// Insert a new node after the given prev_node
			public void insertAfter(Node prev_node,int new_data) {
				if(prev_node==null) {
					System.out.println("The given privious node cannot be null");
				}
				Node new_node=new Node(new_data);
				// make next of new node as prev node
				new_node.next=prev_node.next;
				// make next of prev node as new node
				prev_node.next=new_node;
			}
			public void insertEnd(int new_data) {
				Node new_node=new Node(new_data);
				if(head==null) {
					head=new Node(new_data);
					return;
				}
				new_node.next=null;
				Node temp=head;
				while(temp!=null) {
					temp=temp.next;
					temp.next=new_node;
				}
			}
		// Displaying the Linked list
			public void printList() {
				Node temp=head;
				while(temp!=null) {
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
			}
			
		public static void main(String[] args) {
			LLInsertion list=new LLInsertion();
			// Calling at end 6->null;
			list.insertEnd(6);
			// Calling at begining 7->6->null
			list.push(7);
			// Calling at beg 1->7->6->null
			list.push(1);
			// insert 8 after 7 so it becomes 1->7->8->6->null
			list.insertAfter(list.head.next, 8);
			System.out.println("Created Linked list is ");
			list.printList();
		}
	}


