package com.list;
import java.util.ArrayList;
/**
 * @version
 * @author SHUO GUO
 *
 */
public class ArrayListTest  //查找效率高
{
	public static void main(String[] args)
	{
		ArrayList arraylist=new ArrayList();
		arraylist.add("hello");
		arraylist.add(56);
		arraylist.add("ddsfs");
		arraylist.add(7777);
		arraylist.add(new Point(3,5));
		System.out.println(arraylist);
		
//		String s0=arraylist.get(0).toString();
//		String s1=arraylist.get(1).toString();
//		String s2=arraylist.get(2).toString();
//		System.out.println(s0);
//		System.out.println(s1);
//		System.out.println(s2);
		System.out.println("-----------"); 
		for(int i=0;i<arraylist.size();i++)          //条件输出 arraylist 内容
		{
			if(arraylist.get(i) instanceof String)
			{         //get(i)是object类型， 打印get(i)就是打印 get(i).tostring()
				System.out.println((String)arraylist.get(i));
			}
			
			if(arraylist.get(i) instanceof Point)
			{         //get(i)是object类型， 打印get(i)就是打印 get(i).tostring()
				System.out.println((Point)arraylist.get(i));
			}		
		}
		
		
	//	arraylist.clear();
	//	System.out.println(arraylist.size());
		System.out.println("-----------"); 
		
		arraylist.remove(0);       // o去掉 在位置1的指针变为0
		arraylist.remove("fduos");
		  System.out.println(arraylist.size());	
		  for(int i=0;i<arraylist.size();i++)
			{
			  System.out.println(arraylist.get(i));				
			}
		  System.out.println("---------");
		  
		  arraylist.add("trte");
		  arraylist.add("ewrw");
		  for(int i=0;i<arraylist.size();i++)
			{
			  System.out.println(arraylist.get(i));				
			}
		  int in=arraylist.indexOf("trte");
		  System.out.println(in);
	
/*
		ArrayList list=new ArrayList();
		list.add("fdfddet");
		list.add(new Integer(5));
		String s=list.get(0).toString();
		String s1=list.get(1).toString();
		System.out.println(list);
		
		Integer it=new Integer(4);
		list.clear();
		
		list.add(new Integer(6));
		list.add(new Integer(8));
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
			sum=sum+(int)list.get(i);  // E  get(i)  对应包装类 型
		//	sum=sum+((Integer) list.get(i)).intValue();
		}                               //object 类型转换
		System.out.println(sum);
		
		list.clear();            //
		System.out.println("---------");
		
		ArrayList list1=new ArrayList(); // object 类型链表  加入 object类型  对象
		list1.add(new Integer(1));
		list1.add(new Integer(2));
		list1.add(new Integer(3));
		list1.add(new Integer(4));
		list1.add(new Integer(5));
		System.out.println(list1);
		
		
		 Object[] ob=list1.toArray();   // 存入 object类型 数组
		 for(int i=0;i<ob.length;i++)
		 {
			 System.out.println(((Integer)ob[i]).intValue());
			 System.out.println(((Integer)list1.get(i)).intValue());
		 }
*/	
		/*
		 * object[] 不能 转为Integer[]     Integer 继承object，但 Integer[] 没继承object[]
		 * add()可放任何object类型 对象
		 */
	//	 Integer[] a=new Integer[8]; object[] toArray()
		// Integer[] in= (Integer[]) list1.toArray();   //object类型数组
/*		 Integer[] B =new Integer[6];
		 for(int i=0;i<list1.size();i++)
		 {
			 B[i]=(Integer) list1.get(i);  //对应当前类型
			 System.out.println(B[i].intValue());
		 }
		
*/	
/*	
		ArrayList list=new ArrayList();        //可变数组
		list.add(new Point(4,5));
		list.add(new Point(3,7));              //集合中存放的是引用
		list.add(new Point(6,9));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)); //name of object and address
			      //调用每个对象的 tostring方法，打印名字，地址
		}
		System.out.println(list);
	}
	*/
}
}
class Point          //自定义类必须自定义tostring才能最正常输出
{
	static int x;
	static int y;
	/**
	 * 
	 * @param x -coordinat od x
	 * @param y
	 */
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	/**
	 * @return return (x,y)
	 */
	public String toString()
	{
		return "x="+this.x+" y="+this.y;
	}
	
}
