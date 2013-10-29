package com.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashet
{
	public static void main(String[] args)
	{
		/*
		 * HashSet set=new HashSet(); //Ìí¼Ó¶ÔÏó System.out.println(set.add("a"));
		 * set.add("b"); set.add("c"); set.add("d");
		 * System.out.println(set.add("b")); System.out.println(set);
		 */
		HashSet set = new HashSet();

		P p1=new P(3);
		P p2=new P(5);
		P p3=new P(32);
		P p4=new P(32);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		System.out.println(set + " " + set.hashCode() + " " + set.size());

		for (Iterator iter = set.iterator(); iter.hasNext();)
		{
			String s = iter.next().toString();
			System.out.println(s);
		}

		TreeSet set1 = new TreeSet(new com());
	
//		P p1=new P(3);
//		P p2=new P(5);
//		P p3=new P(32);
//		P p4=new P(32);
		
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
         System.out.println(set1);
         for(Object o:set1)
         {
        	 System.out.println(o);
         }
          
	}
}
class P
{
	int age;

	public P(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return  String.valueOf(this.age);
	}
	
}

class com implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		P p1=(P)o1;
		P p2=(P)o2;
		return p1.age-p2.age;
		
	}
}