package com.enumeration;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class EnumSetT2
{
	public static void main(String[] args)
	{
		List<Font> list = new ArrayList<Font>();
		list.add(Font.blue);
		list.add(Font.bold);
		list.add(Font.plain);
		showEnum(EnumSet.copyOf(list));
	}

	public static void showEnum(EnumSet<Font> enumset)
	{
		for (Iterator<Font> iter = enumset.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}

}
