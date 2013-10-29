package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest4
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
       map.put("a","aa");
       map.put("b","bb");
       map.put("c","cc");
       map.put(55,"dd");
       
      Set set2=map.keySet();
       for(Object ss:set2)                             // 条件输出 不同对象元素
       {
    	   if(ss instanceof String){
    	   System.out.println((String)ss+" :"+map.get(ss));}
    	   if(ss instanceof Integer){
    		   System.out.println((Integer)ss+" ::"+map.get(ss));}
    	   
       }
       System.out.println("-----------"); 
       
       Set set=map.entrySet();  //inner class
       for(Iterator iter=set.iterator();iter.hasNext();)
       {
    	   Map.Entry entry=(Entry) iter.next();     //e next(); 
    	   String key=(String)entry.getKey();
    	   String value=(String)entry.getValue();
    	   System.out.println(key+" "+value);
       }
       System.out.println("-----------");
       Set set1=map.keySet();
       for(Iterator iter1=set1.iterator();iter1.hasNext();)
       {
    	   String s=(String)iter1.next();
    	   String s1=(String)map.get(s);
    	   System.out.println(s+" "+s1);
       }
       
      
	}
}
