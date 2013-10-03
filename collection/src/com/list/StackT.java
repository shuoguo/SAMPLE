package com.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class StackT
{
	private LinkedList queue = new LinkedList();

	public void put(Object o)
	{
		queue.addLast(o);
		System.out.println(queue);
	}

	public Object get()
	{
		return queue.pollFirst();
	}

	public boolean isEmpty()
	{
		return queue.isEmpty();
	}

	public static void main(String[] args)
	{
		StackT myqueue = new StackT();

		myqueue.put("one");
		myqueue.put("two");
		myqueue.put("three");

		System.out.println(myqueue.get());
		System.out.println(myqueue.get());
		System.out.println(myqueue.queue);
	}

}
