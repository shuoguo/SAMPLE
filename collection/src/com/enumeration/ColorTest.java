package com.enumeration;

public class ColorTest
{
	public static void main(String[] args)
	{
		Color c = Color.Blue;
		System.out.println(c);

		for (Color co : Color.values())
		{
			System.out.println(co);
		}
	}
}