package com.enumeration;

import java.util.EnumSet;
import java.util.Iterator;

enum Font
{
	plain, bold, italic, red, blue
}

public class EnumSetTest
{
	public static void main(String[] args)
	{ // ���� һ��enumset
		EnumSet<Font> enumset = EnumSet.of(Font.plain, Font.italic);
		showEnum(enumset);

		showEnum(EnumSet.complementOf(enumset)); // ����Ԫ��

	}
	public static void showEnum(EnumSet<Font> enumset)
	{
		for (Iterator<Font> iter = enumset.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
}
