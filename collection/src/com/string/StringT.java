package com.string;

public class StringT
{
	public static void main(String[] args) 
	{
      Object obj=new Object();                                    
	  Object obj2=new Object();
    System.out.println(obj==obj2); //���õ�ַx   f
System.out.println(obj.equals(obj2));// this== obj���õ�ַx f  ������ͬ�����
System.out.println("---------");

  Integer in=new Integer(4);
  Integer in2=new Integer(4);
System.out.println(in==in2);    //  f
System.out.println(in.equals(in2)); // ����object ���� equals  t
System.out.println("-------------");
       String str=new String("aaa"); //  string ����  
	   String str2=new String("aaa");
     System.out.println(str==str2);//���õ�ַx  f
	 System.out.println(str);
System.out.println(str.equals(str2)); // ����astring �ڸ�д��equals���ݱȽ� t
System.out.println("---------");

     Stu stu=new Stu("iii");       //  �Զ����� stu 
	 Stu stu2=new Stu("iii");       //
    System.out.println(stu==stu2); //���õ�ַx   f
System.out.println(stu.equals(stu2));// f �Զ�����û�ж���equals������Ĭ�϶���ͬ
System.out.println("---------");

        String str3="fff";   //string pool���еĶ��� �ٸ�ֵʱ�����ַ���أ�
		                   //�����µ����ñ��� 
		String str4="fff";
		//str3="ttt";
 System.out.println(str3==str4);//  y
 System.out.println(str3.equals(str4));// y
System.out.println("---------");

       String str5=new String("rrr"); //���еĶ����ַ
	   String str6="rrr";     //string pool�ж����ַ
	    System.out.println(str5==str6);// n
		System.out.println(str5.equals(str6));// y
System.out.println("---------");

        String s="hello";
		String s2="hel";                 //  not know
		 System.out.println(s2);
		String s3="lo";
		String s4=s2+s3; 
		System.out.println(s==s4);//n    s2+s3�����µĶ���
 System.out.println(s);
		 System.out.println(s.equals(s2+s3));//y
System.out.println("---------");

 System.out.println(s=="hel"+"lo");//y
 System.out.println(s.equals("hel"+"lo"));//y
System.out.println("-----------------------");
        s.intern();

	}
}
class Stu extends Object
{
	String name;
	public Stu(String name)
	{
	this.name=name;
	}
}