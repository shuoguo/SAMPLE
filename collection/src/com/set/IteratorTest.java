package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest
{
  public static void main(String[] args)
{
	  HashSet hashset=new HashSet();
//	  hashset.add("aa");
//	  hashset.add("bb");
//	  hashset.add("cc");
//	  hashset.add("dd");
//	  
	  hashset.add(55);
	  hashset.add(4);
	  hashset.add(33);
	
	  System.out.println(hashset);
	  
//	  Iterator iter=hashset.iterator();
	//  while(iter.hasNext())             // 与arraylist，linkedlist不同 
//	  {                                    //无法 条件输出元素
//		  if(iter.next() instanceof String) // 单一类型元素集合
//	     {  
//			  String st=(String)iter.next();
//			  System.out.println(st);
//		 }
//		  
//		  if(iter.next() instanceof Integer)
//		  {
//			  Integer in=(Integer)iter.next();
//			  System.out.println(in);
//		  }
//		 System.out.println(iter.next());
//		  String st=(String)iter.next();
//		  System.out.println(st);
//	  }
	  
  for(Iterator iter=hashset.iterator();iter.hasNext();)
  {
	//  String st=(String)iter.next();
		  Integer in=(Integer)iter.next();
		  System.out.println(in);
  }	  
 
  }
}
 
 

