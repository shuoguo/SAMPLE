package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put("a", "qqqq");
		map.put("b", "eee");
		map.put("c", 777);
		map.put("a", "hhhh"); // override qqqq
		map.put("3", "qqq");
		System.out.println(map);
		
		
//		Set s = map.keySet();
		 Set s=map.entrySet();
		 
		for (Iterator iter = s.iterator(); iter.hasNext();)
		{
	/*		if (iter.next() instanceof String)
			{
				String s1 = (String) iter.next();
				String s2=map.get(s1).toString();
				System.out.println(s1 + " " + s2);
			}
			if (iter.next() instanceof Integer)
			{
				Integer in = (Integer) iter.next();
				String s3=map.get(in).toString();
				System.out.println(in + " " + s3);
			}
*/         
		/*	String s1 = (String) iter.next();
			String s2=map.get(s1).toString();
			System.out.println(s1 + " " + s2);
	*/
			Map.Entry e=(Entry)iter.next();
			String key=e.getKey().toString();
			String value=e.getValue().toString();
			 System.out.println(key+" "+value);
		}
		/*
		 * String in=map.get("c").toString(); 
		 * System.out.println(in);
		 * //------------------------------------------- String
		 * s1=(String)map.get(5); 
		 * System.out.println(s1);
		 * 
		 * //=========================================== HashMap map1=new
		 * HashMap(); 
		 * String st=new String("rrrr"); // map1.put("a",st);
		 * map1.put("b",st); 
		 * System.out.println(map1); 
		 * Set set=map1.keySet();
		 * 
		 * System.out.println(set); //集合里有不同类型元素
		 */

	}
}
