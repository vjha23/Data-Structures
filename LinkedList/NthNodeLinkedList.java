

public class NthNodeLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data=d;
			next=null;
		}
	}
	
	public void push(int data) {
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
public void NthNode(int index) {
	Node temp=head;
	int count=1;
	while(temp!=null) {
		if(count==index) {
			System.out.println("The element at index "+index+" is "+temp.data);
			break;
		}
		count++;
		temp=temp.next;
		}
	}

public static void main(String[] args) {
	NthNodeLinkedList list=new NthNodeLinkedList();
	list.push(6);
	list.push(8);
	list.push(23);
	list.NthNode(3);
}
}


