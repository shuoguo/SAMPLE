package com.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		set.add("c");
		set.add("d");
		set.add("e");
		set.add("b");
		set.add("a");
		for (Iterator iter = set.iterator(); iter.hasNext();)
		{
			String s = iter.next().toString();
			System.out.println(s);
		}

		TreeSet set1 = new TreeSet(new MyComparator());
		set1.add("c"); // Comparator类型
		set1.add("d"); // 添加对象
		set1.add("e");
		set1.add("b");
		set1.add("E");
		set1.add("a");
		for (Iterator iter1 = set1.iterator(); iter1.hasNext();)
		{
			String st1 = iter1.next().toString();
			System.out.println(st1);
		}
	}
}

class MyComparator implements Comparator // 复写Comparator 里的xomparator方法
{
	@Override
	public int compare(Object o1, Object o2)
	{                              //添加的是string类型
		String s1 = (String) o1;    // 因此转成string类型 来比较
		String s2 = (String) o2;

		return s2.compareTo(s1);
	}
}