package com.vahe.util;

/**
 * represents a stack class
 * @author vmjc
 *
 */
public class Stack<T> implements StackInterface<T>{

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
	 * @param newValue the string to be added to the stack.
	 * @author vmjc
	 */
	public void push(T newValue) {
		StackElement<T> newElement = new StackElement<T>(newValue,top);
		top = newElement;
		size++;
	}
	
	/**
	 * method gets out the top element from the stack
	 * @return returns the top value if available, otherwise null.
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
	 * method peeks (gets without removing) the top value
	 * @return returns the top value in stack.
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
	 * @author vmjc
	 */
	public void empty() {
		size =0;
		top = null;
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}
	
	
}
