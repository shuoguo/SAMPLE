package com.enumeration;

public class ShowEnum2
{
	public static void main(String[] args)
	{
		for (Num num : Num.values())
		{
			System.out.printf("%d, %s %s %n", num.ordinal(), num, num.get());
		}
		try
		{
			Num e = Num.valueOf("t");// 赋值范围必须是 enum里定义的 即abcd中一个
		if ( Num.a==e)
		{
			System.out.println("true");
		}
		if (Num.a != e)
		{
			System.out.println("false");
		}
		}
		catch (Exception E)
		{
		}
	}
}

enum Num
{
	a("1"), b("2"), c("3"), d("4");
	private String s;

	Num(String st)
	{
		this.s = st;
	}

	public String get()
	{
		return s;
	}
}