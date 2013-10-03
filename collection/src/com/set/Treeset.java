package com.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet(); // 按顺序 排列

		set.add("a");
		set.add("t");
		set.add("c");
		set.add("y");
		System.out.println(set);
		// -----------------------------------------------------
		TreeSet set1 = new TreeSet(new MyComparator2());
		// 按自定义 比较方法 顺序 排列
		Person p1 = new Person(22);
		Person p2 = new Person(5);
		Person p3 = new Person(14);
		Person p4 = new Person(52);
		System.out.println(p1);// 打印对象引用即调用 tostring

		set1.add(p1); // 按顺序加入person类型
		set1.add(p2); //
		set1.add(p3);
		set1.add(p4);
		System.out.println(set1);
		// -----------------------------------------------------

		TreeSet set2 = new TreeSet(new Comparator2());

		Student s1 = new Student("qwe");
		Student s2 = new Student("arty"); //按首字母 asscii 比较
		Student s3 = new Student("Ryui");
		Student s4 = new Student("uio");

		set2.add(s1);
		set2.add(s2);
		set2.add(s3);
		set2.add(s4);
		System.out.println(set2.contains(s2));
		System.out.println(set2);
		for(Iterator iter=set2.iterator();iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
}

class Person
{
	int score;

	public Person(int score)
	{
		this.score = score;
	}

	public String toString()
	{
		return String.valueOf(this.score);
	}
}

class Student
{
	int age;
	String name;

	public Student(String name)
	{
		this.name = name;
	}

	public Student(int age)
	{
		this.age = age;
	}

	public String toString()
	{
		return this.name;
	}
}

class Comparator2 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
         Student s1=(Student)o1;
         Student s2=(Student)o2;
         return s1.name.compareTo(s2.name);
	}

}

class MyComparator2 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) // 添加的是person，比较的是person类型
	{
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		return p1.score > p2.score ? 1 : -1;// p1-p2
	}
}