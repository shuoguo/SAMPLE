package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest2
{
public static void main(String[] args)
{
	HashMap map=new HashMap();
	map.put("a","qqqq");
	map.put("b","eee");
	map.put("c","777");
	map.put("a","hhhh");
	map.put("3","qqq");
	//System.out.println(map);
	
	
	Set set2=map.entrySet();
	for(Iterator it=set2.iterator();it.hasNext();)
	{
		Map.Entry entry=(Entry)it.next();
		String key=(String)entry.getKey();
		String value=(String)entry.getValue();
		System.out.println(key+":"+value);
	}

//	Set set=map.keySet();
//	
//	for(Iterator iter=set.iterator();iter.hasNext();)
//	{
//		Object key=iter.next();   //没有强制转换  不同类型都可以输出
//		Object value=map.get(key);
//			System.out.println(key.toString()+" "+value.toString());	
//	}
//	System.out.println("   ------------------ ");
////--------------------------------------------	
	HashMap<String,Integer> map1=new HashMap<String,Integer>();
	
	map1.put("a",545);
	map1.put("b",4334);
	map1.put("f",655);
	map1.put("s",324);
	
	Set<Entry<String, Integer>> set1=map1.entrySet();
	for(Iterator<Entry<String, Integer>> iter=set1.iterator();iter.hasNext();)
	{
//		String s1=(String)iter.next(); // 单一类型 定义
//		String in=map1.get(s1).toString();
//		System.out.println(s1+" "+in);
			Map.Entry<String, Integer> entry = iter.next();
			String s = entry.getKey();
			Integer in = entry.getValue();
		System.out.println(s+" "+in);
	}
		for (Entry<String, Integer> o : set1)
	{
		System.out.println(o);
	}
}
}
