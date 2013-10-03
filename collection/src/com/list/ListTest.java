package com.list;

public class ListTest
{
	public static void main(String[] args)
	{
     Node node=new Node("node");
     Node node1=new Node("node1");
     Node node2=new Node("node2");
    
     node.next=node1;
 	node1.next=node2;
 	
 	System.out.println(node.next.next.data);
 	
 	
 	Node node4=new Node("node4");
 	node1.next=node4;
 	node4.next=node2;
 	
 	System.out.println(node.next.next.data);
 
		
	}
	
}

class Node
{
    String data;
    Node next;
	
	public Node(String data)
	{
		this.data=data;
	}
    public void setData(String s)
    {
    	this.data=s;
    }
	public String getData()
	{
		return data;
	}
}