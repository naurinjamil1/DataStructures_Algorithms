package main.java;

public class BinarySearchTree {
	
	/* use RECURSION */
	public Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int d) {
			this.data = d;
			this.left = null;
			this.right = null;			
		}		
	}
	
	public Node getNewNode(int data) {
		Node newNode = new Node(data);
		return newNode;		
	}
	
	// insert data in BST and return root node
	public Node insert(Node root, int data) {
		if(root == null) {
			root = getNewNode(data);
		} else if(data <= root.data) {
			insert(root.left, data);
		} else {
			insert(root.right, data);
		}
			
		return root;		
	}
	
	public boolean search(Node root, int data) {
		if(root == null)
			return false;
		else if(data == root.data)
			return true;
		else if(data <= root.data) {
			return search(root.left, data);
		} else {
			return search(root.right, data);
		}
	}
	
	public Node delete(Node root, int data) {
		if(root == null)
			return root;
		else if (data <= root.data)
			root.left = delete(root.left, data);
		else if(data > root.data)
			root.right = delete(root.right, data);
		else { // found case
			// case 1: no child
			if(root.left == null && root.right == null) {
//				delete root;
				root = null;
				return root;
			}
			// case 2: 1 child
			else if(root.left == null) {
				Node temp = root;
				root = root.right;
//				delete temp;
				return root;
			} else if(root.right == null) {
				Node temp = root;
				root = root.left;
//				delete temp;
				return root;
			} 
			else { // 2 children		
				Node temp = findMin(root.right);
				root.data = temp.data;
			//	root.right = delete(root.right);
				
			}
		}
		return root;
	}
	
	public Node findMin(Node root) {
		if(root == null) {
			return null;
		} else if(root.left == null) {
			return root;
		}
		return findMin(root.left);	
	}
	
	public Node findMax(Node root) {
		if(root == null) {
			return null;
		} else if(root.right == null) {
			return root;
		} 
		return findMax(root.right);
	}
	
	public int findheight(Node root) {
		if(root == null)
			return -1;
		return Math.max(findheight(root.left), findheight(root.right)) + 1;
	}
	 public void preOrderTraversal(Node root) {
		 if(root == null)
			 return;
		 System.out.println(root.data);
		 preOrderTraversal(root.left);
		 preOrderTraversal(root.right);
		 
	 }
	 public void inOrderTraversal(Node root) {
		 if(root == null)
			 return;
		 inOrderTraversal(root.left);
		 System.out.println(root.data);
		 inOrderTraversal(root.right);
	 }
	 public void postOrderTraversal(Node root) {
		 if(root == null)
			 return;
		 postOrderTraversal(root.left);
		 postOrderTraversal(root.right);
		 System.out.println(root.data);
	 }
}
