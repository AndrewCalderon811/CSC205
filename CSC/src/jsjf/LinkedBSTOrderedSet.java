package jsjf;

import java.util.Iterator;

import jsjf.exceptions.ElementNotFoundException;
import jsjf.exceptions.EmptyCollectionException;
import jsjf.exceptions.NonComparableElementException;

public class LinkedBSTOrderedSet<T> extends LinkedBinaryTree<T>
implements OrderedSetADT<T>{

	public LinkedBSTOrderedSet() {
		
	}

	@Override
	public void addElement(T element) {
		if (!(element instanceof Comparable))
			throw new NonComparableElementException("LinkedBinarySearchTree");

		Comparable<T> comparableElement = (Comparable<T>)element;

		if (isEmpty())
			root = new BinaryTreeNode<T>(element);
		else if(!contains(element))
			addElement(element, root);
		modCount++;
	}
	
	private void addElement(T element, BinaryTreeNode<T> node) 
	{
		Comparable<T> comparableElement = (Comparable<T>)element;

		if (comparableElement.compareTo(node.getElement()) < 0)
		{
			if (node.getLeft() == null) 
				node.setLeft(new BinaryTreeNode<T>(element));
			else
				addElement(element, node.getLeft());
		}
		else
		{
			if (node.getRight() == null) 
				node.setRight(new BinaryTreeNode<T>(element));
			else
				addElement(element, node.getRight());
		}
	}

	@Override
	public T removeElement(T targetElement) {
		T result = null;

		if (isEmpty())
			throw new ElementNotFoundException("LinkedBinarySearchTree");
		else
		{
			BinaryTreeNode<T> parent = null;
			if (((Comparable<T>)targetElement).equals(root.element)) 
			{ // Remove the root
				result =  root.element;
				BinaryTreeNode<T> inOrderSuccessor = replacement(root);
				if (inOrderSuccessor == null)
					root = null;
				else 
				{
					root.element = inOrderSuccessor.element;
					root.setRight(inOrderSuccessor.right);
					root.setLeft(inOrderSuccessor.left);
				}

				modCount++;
			}
			else 
			{ // Look for the target in a sub-tree               
				parent = root;
				if (((Comparable<T>)targetElement).compareTo(root.element) < 0)
					result = removeElement(targetElement, root.getLeft(), parent);
				else
					result = removeElement(targetElement, root.getRight(), parent);
			}
		}

		return result;
	}
	
	private T removeElement(T targetElement, BinaryTreeNode<T> node, BinaryTreeNode<T> parent)
			throws ElementNotFoundException 
	{
		T result = null;

		if (node == null)
			throw new ElementNotFoundException("LinkedBinarySearchTree");
		else
		{
			if (((Comparable<T>)targetElement).equals(node.element)) 
			{   // remove the current node
				result =  node.element;
				BinaryTreeNode<T> inOrderSuccessor = replacement(node);
				// Decide if current node is left or right child of the parent
				if (parent.right == node)
					parent.right = inOrderSuccessor;
				else 
					parent.left = inOrderSuccessor;

				modCount++;
			}
			else 
			{   // Look for the target in a sub-tree            
				parent = node;
				if (((Comparable<T>)targetElement).compareTo(node.element) < 0)
					result = removeElement(targetElement, node.getLeft(), parent);
				else
					result = removeElement(targetElement, node.getRight(), parent);
			}
		}

		return result;
	}
	
	private BinaryTreeNode<T> replacement(BinaryTreeNode<T> root) 
	{
		BinaryTreeNode<T> result = null;

		// No children
		if ((root.left == null) && (root.right == null))
			result = null;

		// One child - left
		else if ((root.left != null) && (root.right == null))
			result = root.left;

		// One child - right
		else if ((root.left == null) && (root.right != null))
			result = root.right;

		else
		{
			BinaryTreeNode<T> current = root.right;
			BinaryTreeNode<T> parent = root;

			while (current.left != null)
			{
				parent = current;
				current = current.left;
			}

			// Set the replacement's left subtree to the root's left subtree
			current.left = root.left;
			if (root.right != current)
			{
				parent.left = current.right;
				current.right = root.right;
			}

			result = current;
		}

		return result;
	}

	@Override
	public T find(T targetElement) {
T result = null;
		
		if (isEmpty()) {
			throw new EmptyCollectionException("LinkedBinarySearchTree");
		}
		
		if(((Comparable<T>)targetElement).equals(root.element)) {
			result = root.element;
		}
		else {
			if(((Comparable<T>)targetElement).compareTo(root.element) < 0) {
				if(root.left != null)
				result = find(targetElement, root.left);
			}
			else {
				if(root.right != null)
				result = find(targetElement, root.right);
			}
		}
		return result; 
	}
	
	private T find(T targetElement, BinaryTreeNode<T> node) throws EmptyCollectionException {
		T result = null;
		
			if(((Comparable<T>)targetElement).equals(node.element)) {
				result = node.element;
			}
			else {
				if(((Comparable<T>)targetElement).compareTo(node.element) < 0) {
					if(node.left != null) {
						result = find(targetElement, node.left);
					}
				}
				else {
					if(node.right != null) {
						result = find(targetElement, node.right);
					}
				}
			}		
		return result;
	}

	@Override
	public T findMin() {
		T ret = null;
		if(isEmpty()) {
			throw new EmptyCollectionException("LinkedBinarySearchTree");
		}
		else {
			BinaryTreeNode<T> current = root;
			
			while(current.left != null) {
				ret = current.left.element;
				current = current.left;
			}
		}
		
		return ret; 
	}

	@Override
	public T findMax() {
		T ret = null;
		if(isEmpty()) {
			throw new EmptyCollectionException("LinkedBinarySearchTree");
		}
		else {
			BinaryTreeNode<T> current = root.right;
			
			while(current.right != null) {
				ret = current.right.element;
				current = current.right;
			}
		}
		
		return ret;
	}

	@Override
	public boolean contains(T targetElement) {
		boolean ret = false;
		
		if(find(targetElement) != null) {
			ret = true;
		}
		
		return ret;
	}

	@Override
	public Iterator<T> iterator() {
		return iteratorInOrder();
	}
	
	 
}
