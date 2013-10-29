package com.enumeration;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetT1
{

	public static void main(String[] args)
	{
		EnumSet<Font> enumset = EnumSet.noneOf(Font.class);// 只接受Font 类型
		enumset.add(Font.blue);
		enumset.add(Font.bold);

		showEnum(enumset);
	}

	public static void showEnum(EnumSet<Font> enumset)
	{
		for (Iterator<Font> iter = enumset.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}

}
