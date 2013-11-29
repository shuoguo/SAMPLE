package com.stack;

public class Stack<T>
{
	Node<T> head;

	public Stack()
	{
		head = new Node<T>();
	}

	public void push(T value)
	{
		if (null == head.value)
		{
			head.value = value;
		}
		else
		{
			Node<T> top = new Node<T>();
			top.setValue(value);
			top.setNext(head);
			head = top;
		}
	}

	public T pull()
	{
		if (null == head.value)
		{
			System.out.println("empty stack");
			return null;
		}
		else
		{
			T temp = head.value;
			head = head.next;
			return temp;
		}
	}

	public String toString()
	{
		return head.toString();
	}

	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(4);
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.pull();
		System.out.println(stack);
	}
}

class Node<T>
{
	T value;
	Node<T> next;

	public Node()
	{
		value = null;
		next = null;
	}

	public T getValue()
	{
		return value;
	}

	public void setValue(T value)
	{
		this.value = value;
	}

	public Node<T> getNext()
	{
		return next;
	}

	public void setNext(Node<T> next)
	{
		this.next = next;
	}

	public String toString()
	{
		return value + " " + next;
	}
}