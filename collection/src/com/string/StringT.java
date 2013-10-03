package com.string;

public class StringT
{
	public static void main(String[] args) 
	{
      Object obj=new Object();                                    
	  Object obj2=new Object();
    System.out.println(obj==obj2); //引用地址x   f
System.out.println(obj.equals(obj2));// this== obj引用地址x f  对象相同择相等
System.out.println("---------");

  Integer in=new Integer(4);
  Integer in2=new Integer(4);
System.out.println(in==in2);    //  f
System.out.println(in.equals(in2)); // 调用object 方法 equals  t
System.out.println("-------------");
       String str=new String("aaa"); //  string 类型  
	   String str2=new String("aaa");
     System.out.println(str==str2);//引用地址x  f
	 System.out.println(str);
System.out.println(str.equals(str2)); // 调用astring 内复写的equals内容比较 t
System.out.println("---------");

     Stu stu=new Stu("iii");       //  自定义类 stu 
	 Stu stu2=new Stu("iii");       //
    System.out.println(stu==stu2); //引用地址x   f
System.out.println(stu.equals(stu2));// f 自定义类没有定义equals方法，默认对象不同
System.out.println("---------");

        String str3="fff";   //string pool中有的对象 再赋值时将其地址返回，
		                   //赋给新的引用变量 
		String str4="fff";
		//str3="ttt";
 System.out.println(str3==str4);//  y
 System.out.println(str3.equals(str4));// y
System.out.println("---------");

       String str5=new String("rrr"); //堆中的对象地址
	   String str6="rrr";     //string pool中对象地址
	    System.out.println(str5==str6);// n
		System.out.println(str5.equals(str6));// y
System.out.println("---------");

        String s="hello";
		String s2="hel";                 //  not know
		 System.out.println(s2);
		String s3="lo";
		String s4=s2+s3; 
		System.out.println(s==s4);//n    s2+s3生成新的对象
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