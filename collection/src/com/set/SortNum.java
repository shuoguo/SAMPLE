package com.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class SortNum
{
	public static void main(String[] args)
	{
		List<Integer> list = new LinkedList<Integer>();
		Random ran = new Random();

		for (int i = 0; i < 20; i++)
		{
			list.add(ran.nextInt(30));
		}
		System.out.println(list);
		TreeSet<Integer> set = new TreeSet<Integer>(); // no duplicate
		set.addAll(list);
		System.out.println(set);
		quicksort(list, 0, list.size() - 1);
		System.out.println(list);

	}

	public static void quicksort(List<Integer> list, int left, int right)
	{
		int i = left;
		int j = right;
		int pivot = list.get((i + j) / 2);

		while (i <= j)
		{
			while (list.get(i) < pivot)
			{
				i++;
			}
			while (list.get(j) > pivot)
			{
				j--;
			}
			if (i <= j)
			{
				int temp = list.get(i);
				int temp2 = list.get(j);
				list.remove(i);

				list.add(i, temp2);
				list.remove(j);
				list.add(j, temp);
				i++;
				j--;
			}
			if (left < j)
			{
				quicksort(list, left, j);
			}
			if (right > i)
			{
				quicksort(list, i, right);
			}
		}
	}
}
