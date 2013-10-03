package com.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest
{

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(new Integer(5));
		list.add(new Integer(87));
		list.add(new Integer(-4));
		list.add(new Integer(24));
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

		Comparator c = Collections.reverseOrder();
		Collections.sort(list, c);
		for (Iterator iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next() + "");
		}

		Collections.shuffle(list);
		System.out.println(list);
        
		Comparator com=Collections.reverseOrder();

		System.out.println("MIN IS " + Collections.min(list,com));
		System.out.println("Max IS " + Collections.max(list));
	}

}

