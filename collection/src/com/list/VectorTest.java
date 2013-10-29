package com.list;

import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class VectorTest
{
public static void main(String[] args)
{
	Vector v=new Vector();
	v.add(44);
	v.add(66);
	v.add("dfd");
	
	for(int i=0;i<v.size();i++)
	{
		System.out.println(v.get(i));
	}
	System.out.println(v.size()+":"+v.capacity());
	
	Properties p=System.getProperties();    //hashtable sub class
	Set set=p.keySet();
//	for(Iterator i=set.iterator();i.hasNext();)
//	{
//		System.out.println(i.next().toString()+"<>  "+p.getProperty((String) i.next()));
//	}
	for(Object o:set)
	{
		System.out.println(o+" "+p.get(o));
	}
}

}
