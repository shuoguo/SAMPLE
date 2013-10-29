package com.list;
import java.util.LinkedList;

public class LinkLst
{
	
	
	public static void main(String[] args)
	{
		
		LinkedList linkedlist=new LinkedList();// 链表

		 linkedlist.add("a"); // 插入效率高
		 linkedlist.add("s");
		 linkedlist.add("d");
		 linkedlist.add("f");
		 linkedlist.add("g");
		 
		 linkedlist.addFirst("q");
		 linkedlist.addLast("e");
		 linkedlist.add(1,"i");
		 
		 System.out.println(linkedlist);
		 
		 linkedlist.remove(2);
		 linkedlist.remove("s");
		 System.out.println(linkedlist);
		 
		 Object[] o=linkedlist.toArray();
		 System.out.println(o[3].toString());
		 
		 Object value=linkedlist.get(2);
		 linkedlist.set(1,(String)value+"");
		 System.out.println(linkedlist);
		 
		 for(Object obj:linkedlist)
		 {
			 System.out.println(obj); 
		 }
	}

}