package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityqueue
{
	public static void main(String[] args)
	{
		compa co = new compa();
		PriorityQueue<Integer> que = new PriorityQueue<Integer>(10, co);

		for (int i = 0; i < 10; i++)
		{
			que.add(i + 3);
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.printf("%d ", que.poll());
		}
	}

}

class compa implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2)
	{

		// TODO Auto-generated method stub
		return o2 - o1;
	}

}