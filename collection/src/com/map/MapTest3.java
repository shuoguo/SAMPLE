package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest3
{
	public static void main(String[] args)
	{
		// HashMap map = new HashMap();
		// for (int i = 0; i < args.length; i++)
		// {
		// if (map.containsKey(args[i]))
		// {
		// Integer in = (Integer) map.get(args[i]);
		// int co = in.intValue() + 1;
		// map.put(args[i], co);
		// }
		// else
		// {
		// map.put(args[i], 1);
		// }
		// }
		// Set set = map.keySet();
		// for (Iterator iter = set.iterator(); 
		//iter.hasNext();)
		// {
		// String s = (String) iter.next();
		// Integer in = (Integer) map.get(s);
		// System.out.println(s + " " + in);
		// }
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < args.length; i++)
		{
			if (map.get(args[i]) == null)
			{
				map.put(args[i], new Integer(1));
			}
			else
			{
				map.put(args[i], new Integer((map.get(args[i])).intValue() + 1));
			}
		}
		System.out.println(map);
		Set set = map.keySet(); // 输出map元素，map key--keyset--get 基于key
		for (Iterator iter = set.iterator(); iter.hasNext();)
		{
			String s = (String) iter.next();
			Integer in = (Integer) map.get(s);
			System.out.println(s + " num is " + in);
		}
		
		String s="erwfflksfjlfjlaf";
		
		reduce(s);
		
	}
	public static void reduce(String s)
	{
		HashMap<String,Integer> map2=new HashMap();
		String st=s;
		for(int i=0;i<st.length();i++)
		{
			if(map2.get(st.substring(i,i+1))==null)
			{
				map2.put(st.substring(i,i+1),new Integer(1));
				System.out.print(st.substring(i,i+1));
			}
//			else
//			{
//				map2.put(st.substring(i,i+1),new Integer((Integer)map2.get(st.substring(i,i+1)).intValue()+1));
//			
//			}
		}
	}

}
