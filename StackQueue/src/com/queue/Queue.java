package com.queue;

public class Queue<T>
{
	Node<T> head;
	Node<T> end;

	public Queue()
	{
		head = new Node<T>();
	}

	public void enqueue(T value)
	{
		if (null == head.value)
		{
			head.value = value;
		}
		else
		{
			Node<T> temp = new Node<T>();
			temp.value = value;
			head.next = temp;
			head = temp;
		}
	}

	public static void main(String[] args)
	{

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

	public String toString()
	{
		return value + " " + next;
	}
}