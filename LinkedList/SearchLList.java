// counting the no of nodes and searching the node
public class SearchLList
{
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
	
	public void Search(int data) {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			if(temp.data==data) {
				System.out.println("Elements is found "+temp.data);
			}
			temp=temp.next;
			count++;
		}
		System.out.println("The no of nodes in the list "+count);
	}
	
	public static void main(String[] args) {
		SearchLList list=new SearchLList();
		list.push(6);
		list.push(8);
		list.push(23);
		list.Search(8);
	}
}
