package com.enumeration;

public class ShowEnum
{
	public static void main(String[] args)
	{
		enumCom(Operation.SHOOT);
	}

	public static void enumCom(Operation op)
	{
		System.out.println(op);
		for(Operation o:Operation.values())
		{
			System.out.println(op.compareTo(o));
		}
	}
}
