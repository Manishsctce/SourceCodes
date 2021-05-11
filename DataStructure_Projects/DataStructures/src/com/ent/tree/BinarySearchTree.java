package com.ent.tree;

/*
 *  Java Program to Implement Binary Search Tree
 */

import java.util.Scanner;

class BST {
	private BSTNode root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	/* Functions to insert data */
	public void insert(int data) {
		root = insert(root, data);
		System.out.println("Root value: " + root.data);
	}

	/* Function to insert data recursively */
	private BSTNode insert(BSTNode subRootNode, int data) {
		//When tree is empty
		if (subRootNode == null)
			subRootNode = new BSTNode(data);
		else {
			if (data <= subRootNode.getData())
				subRootNode.left = insert(subRootNode.left, data);
			else
				subRootNode.right = insert(subRootNode.right, data);
		}
		return subRootNode;
	}

	/* Functions to delete data */
	public void delete(int k) {
		if (isEmpty())
			System.out.println("Tree Empty");
		else if (search(k) == false)
			System.out.println("Sorry " + k + " is not present");
		else {
			root = delete(root, k);
			System.out.println(k + " deleted from the tree");
		}
	}

	private BSTNode delete(BSTNode root, int k) {
		BSTNode p, p2, n;
		if (root.getData() == k) {
			BSTNode lt, rt;
			lt = root.getLeft();
			rt = root.getRight();
			if (lt == null && rt == null)// Only root
				return null;
			else if (lt == null) {
				p = rt;
				return p;
			} else if (rt == null) {
				p = lt;
				return p;
			} else {
				p2 = rt;
				p = rt;
				while (p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(lt);
				return p2;
			}
		}
		if (k < root.getData()) {
			n = delete(root.getLeft(), k);
			root.setLeft(n);
		} else {
			n = delete(root.getRight(), k);
			root.setRight(n);
		}
		return root;
	}

	/* Functions to count number of nodes */
	public int countNodes() {
		return countNodes(root);
	}

	/* Function to count number of nodes recursively */
	private int countNodes(BSTNode r) {
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}

	/* Functions to search for an element */
	public boolean search(int val) {
		return search(root, val);
	}

	/* Function to search for an element recursively */
	private boolean search(BSTNode r, int val) {
		boolean found = false;
		while ((r != null) && !found) {
			int rval = r.getData();
			if (val < rval)
				r = r.getLeft();
			else if (val > rval)
				r = r.getRight();
			else {
				found = true;
				break;
			}
			found = search(r, val);
		}
		return found;
	}

	public void inorder() {
		inorder(root);
	}

	// Inorder traversal (LPR) - visit the left child, then the parent and the right child;
	private void inorder(BSTNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	public void preorder() {
		preorder(root);
	}

	// PreOrder traversal(PLR) - visit the parent first and then left and right children
	private void preorder(BSTNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	/* Function for postorder traversal */
	public void postorder() {
		postorder(root);
	}

	private void postorder(BSTNode r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}
}

/* Class BinarySearchTree */
public class BinarySearchTree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Creating object of BST */
		BST bst = new BST();
		// System.out.println("Binary Search Tree Test\n");
		char ch;
		/* Perform tree operations */
		do {
			// System.out.println("\nBinary Search Tree Operations\n");
			System.out.println("1. insert \t2. delete\t3. search\t4. count nodes");
			System.out.println("5. check empty");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				bst.insert(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter integer element to delete");
				bst.delete(scan.nextInt());
				break;
			case 3:
				System.out.println("Enter integer element to search");
				System.out.println("Search result : " + bst.search(scan.nextInt()));
				break;
			case 4:
				System.out.println("Nodes = " + bst.countNodes());
				break;
			case 5:
				System.out.println("Empty status = " + bst.isEmpty());
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* Display tree */
			
			//System.out.print("\nPost order : "); bst.postorder();
			 
			System.out.print("\nPre order : ");
			bst.preorder();
			/*
			 * System.out.print("\nIn order : "); bst.inorder();
			 */

			System.out.print("\nDo you want to continue (Type y or n):");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}