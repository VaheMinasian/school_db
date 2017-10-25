package com.vahe.util;

/**
 * represents a stack class
 * @author vmjc
 *
 */
public class Stack<T> {

	private StackElement<T> top;
	private int size;
	
	/**
	 * constructor method for Stack class
	 * @author vmjc
	 */
	public Stack() {
		size = 0;
		top=null;
	}
	
	/**
	 * method adds an item to the stack.
	 * @param s the string to be added to the stack.
	 * @author vmjc
	 */
	public void push(T newValue) {
		StackElement<T> newElement = new StackElement<T>(newValue,top);
		top = newElement;
		size++;
	}
	
	/**
	 * 
	 * @return
	 * @author vmjc
	 */
	public T pop() {
		StackElement<T> previousTop = top;
		if(previousTop == null) {
			return null;
		}
		top = top.getNext();
		size--;
		return previousTop.getValue();
	}
	
	/**
	 * 
	 * @return
	 * @author vmjc
	 */
	public T peek() {
		if(size==0) {
			return null;
		}
		return top.getValue();
	}
	
	/**
	 * method checks if stack is empty
	 * @return returns true if stack is empty, otherwise false.
	 * @author vmjc
	 */
	public void empty() {
		size =0;
		top = null;
	}
	
	
}
