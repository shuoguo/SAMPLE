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
	//  while(iter.hasNext())             // ��arraylist��linkedlist��ͬ 
//	  {                                    //�޷� �������Ԫ��
//		  if(iter.next() instanceof String) // ��һ����Ԫ�ؼ���
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
 
 

