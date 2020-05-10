import java.util.Scanner;

public class Lldeletion {
	Node head;
	Node temp;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
// Creating element begining in the linked list
public void push(int new_data) {
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
	
}
	
	
// Deletining at the beginning	
public void DeleteBeg(){
	if(head==null) {
		System.out.println( "The list is already empty");
	}
	else {
		head=head.next;
		System.out.println("The node is deleted\nNow the data in the nodes are ");
		temp=head;
		Display();
		
	}
}
// Deleting from the end
public void DeleteEnd() {
	Node prevNode=head;
	temp=head;
	while(temp.next!=null) {
		prevNode=temp;
		temp=temp.next;
	}
	if(temp==head) {
		head=null;
	}
	else {
		prevNode.next=null;
	}
	Display();
	
}

public void Display() {
	// TODO Auto-generated method stub
	temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}

public void DeletePos(int pos) {
	// TODO Auto-generated method stub
	int i=1;
	Node next_node=head;
	temp=head;
	while(i<pos) {
		temp=temp.next;
		i++;
	}
	next_node=temp.next;
	temp.next=next_node.next;
	
}
public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	Lldeletion list=new Lldeletion();
	list.push(4);
	list.push(56);
	list.push(6);
	list.push(5);
	list.push(9);
	System.out.println("Enter the pos to delete from the node");
	int pos=in.nextInt();
	list.DeletePos(pos);
	System.out.println("Total items in the list");
	list.Display();
	System.out.println("\nDeletion at the beg");
	list.DeleteBeg();
	System.out.println("\nDeletion at the end");
	list.DeleteEnd();
	}



	
}
