package com.list;

public class BiLinkList
{

	 public static void main(String[] args)
	 {
		 Blink node =new Blink("a");
		 Blink node1 =new Blink("b");
		 Blink node2 =new Blink("c");
		 
		 System.out.println(node1.data);
		 node.previous=node2;
		 node.next=node1;
		 node1.previous=node;
		 node1.next=node2;
		 node2.previous=node1;
		 node2.next=node;
		 System.out.println(node1.previous.data);
		 
		 Blink node3 =new Blink("d");
		 node1.next=node3;
		 node3.previous=node1;
		 node3.next=node2;
		 node2.previous=node3;
		 System.out.println(node1.next.data);
	 }
	 
}

class Blink
{
	String data;
	Blink previous;
	Blink next;
	public Blink(String data)
	{
		this.data=data;
	}
	
}