package com.list;
import java.util.ArrayList;
/**
 * @version
 * @author SHUO GUO
 *
 */
public class ArrayListTest  //����Ч�ʸ�
{
	public static void main(String[] args)
	{
		ArrayList<Object> arraylist=new ArrayList<Object>();
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
		for(int i=0;i<arraylist.size();i++)          //������� arraylist ����
		{
			if(arraylist.get(i) instanceof String)
			{         //get(i)��object���ͣ� ��ӡget(i)���Ǵ�ӡ get(i).tostring()
				System.out.println((String)arraylist.get(i));
			}
			
			if(arraylist.get(i) instanceof Point)
			{         //get(i)��object���ͣ� ��ӡget(i)���Ǵ�ӡ get(i).tostring()
				System.out.println((Point)arraylist.get(i));
			}		
		}
		
		
	//	arraylist.clear();
	//	System.out.println(arraylist.size());
		System.out.println("-----------"); 
		
		arraylist.remove(0);       // oȥ�� ��λ��1��ָ���Ϊ0
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
			sum=sum+(int)list.get(i);  // E  get(i)  ��Ӧ��װ�� ��
		//	sum=sum+((Integer) list.get(i)).intValue();
		}                               //object ����ת��
		System.out.println(sum);
		
		list.clear();            //
		System.out.println("---------");
		
		ArrayList list1=new ArrayList(); // object ��������  ���� object����  ����
		list1.add(new Integer(1));
		list1.add(new Integer(2));
		list1.add(new Integer(3));
		list1.add(new Integer(4));
		list1.add(new Integer(5));
		System.out.println(list1);
		
		
		 Object[] ob=list1.toArray();   // ���� object���� ����
		 for(int i=0;i<ob.length;i++)
		 {
			 System.out.println(((Integer)ob[i]).intValue());
			 System.out.println(((Integer)list1.get(i)).intValue());
		 }
*/	
		/*
		 * object[] ���� תΪInteger[]     Integer �̳�object���� Integer[] û�̳�object[]
		 * add()�ɷ��κ�object���� ����
		 */
	//	 Integer[] a=new Integer[8]; object[] toArray()
		// Integer[] in= (Integer[]) list1.toArray();   //object��������
/*		 Integer[] B =new Integer[6];
		 for(int i=0;i<list1.size();i++)
		 {
			 B[i]=(Integer) list1.get(i);  //��Ӧ��ǰ����
			 System.out.println(B[i].intValue());
		 }
		
*/	
/*	
		ArrayList list=new ArrayList();        //�ɱ�����
		list.add(new Point(4,5));
		list.add(new Point(3,7));              //�����д�ŵ�������
		list.add(new Point(6,9));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)); //name of object and address
			      //����ÿ������� tostring��������ӡ���֣���ַ
		}
		System.out.println(list);
	}
	*/
}
}
class Point          //�Զ���������Զ���tostring�������������
{
	 int x;
	 int y;
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
