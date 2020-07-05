// Java Program For Different Tree Traversals
class Node{
	int key;
	Node left,right;
	public Node(int item) {
		key=item;
		left=right=null;
	}
}

public class BinaryTree_1 {
	//Root of Binary Tree
	Node root;
	BinaryTree_1(){
		root=null;
	}
	// Given a binary tree , print its nodes according bottom up postorder traversal
	void printPostorder(Node node) {
		if(node==null) {
			return;
		}
		// first recur on left subtree
		printPostorder(node.left);
		// then recur on right subtree
		printPostorder(node.right);
		// now deal with the node
		System.out.print(node.key+" ");
	}
	// Given a binary tree,print its nodes in inorder
	void printInorder(Node node) {
		if(node==null) {
			return;
		}
		// first recur on left child
		printInorder(node.left);
		// data of node
		System.out.print(node.key+" ");
		// right recur
		printInorder(node.right);
		
	}
	// in preorder form
	void printPreorder(Node node) {
		if(node==null) {
			return;
		}
		// first print data of node
		System.out.print(node.key+" ");
		//recur on left
		printPreorder(node.left);
		// recur on right
		printPreorder(node.right);
	}
	// wrappers over above recursion functions
	void printPostorder() {
		printPostorder(root);
	}
	void printInorder() {
		printInorder(root);
	}
	void printPreorder() {
		printPreorder(root);
	}
	public static void main(String[] args) {
		BinaryTree_1 tree= new BinaryTree_1();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.right.right=new Node(5);
		System.out.print("Preorder traversal of binary tree");
			tree.printPreorder();
		System.out.print("posteorder traversal of binary tree");
		tree.printPostorder();
		System.out.print("ineorder traversal of binary tree");
		tree.printInorder();
	}
}
