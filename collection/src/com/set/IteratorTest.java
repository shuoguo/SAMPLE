package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest
{
  public static void main(String[] args)
{
	  HashSet hashset=new HashSet();
	  hashset.add("aa");
	  hashset.add("bb");
	  hashset.add("cc");
	  hashset.add("cc");
	  
//	  hashset.add(55);
//	  hashset.add(4);
//	  hashset.add(33);
	
	  System.out.println(hashset);
	  
//	  Iterator iter=hashset.iterator();
	//  while(iter.hasNext())             // 
//	  {                                    //
//		  if(iter.next() instanceof String) // 
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
	  if(iter.next().getClass().toString().contains("String")) // 单一类型元素集合
		     {  
		//  String st=iter.next().toString();
				  System.out.println(iter.next().toString());
			 }
	
		//  Integer in=(Integer)iter.next();
		 // System.out.println(in);
  }	  
 
  }
}
 
 

