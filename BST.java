package com.bridgelabz.binarytree;

public class BST {

	public static void main(String[] args) {
		int [] num = {56,30,70};
		Node root = null;
		
		
	}

	public static Node insertNode(Node root, int data) {
		if(root == null) {
			return new Node();
		}
		if(data<root.data) {
			root.left = insertNode(root.left, data);
		}else {
			root.right = insertNode(root.right, data);
		}
		return root;
	}
}
