package com.set;

import java.util.HashSet;

public class Hashet
{
  public static void main(String[] args){
	  
	  HashSet set=new HashSet();        //��Ӷ���
	  System.out.println(set.add("a"));
	  set.add("b");
	  set.add("c");
	  set.add("d");
	  System.out.println(set.add("b"));
	  System.out.println(set);
  }
}
