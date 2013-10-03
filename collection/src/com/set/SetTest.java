package com.set;

import java.util.HashSet;

public class SetTest
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(new People("liyu")); // 匿名对象 3个对象 地址不同
		set.add(new People("800")); // 调用hashset 则调用对象的hashcode,不相等则加入
		set.add(new People("liyu")); // 相等则 看equals 相等则不加
		System.out.println(set);
		// ------------------ --------- --------- ---------
		People p1 = new People("abcde"); // 自定义类
		set.add(p1); // 引用相同 不添加
		set.add(p1);
		System.out.println(set);
		// ------------------ --------- --------- ---------
		People p2 = new People("wewe"); // 自定义类
		People p3 = new People("wewe"); // equals 对自定义类没定义
		set.add(p2); // equals 只对 已有 类型有定义
		set.add(p3); // 自定义类需要 复写 tostring，hashcode，equals 3个方法才能正常输出
		System.out.println(p2.hashCode() + " " + p3.hashCode());
		System.out.println(set);
		// ------------------ --------- --------- ---------
		String s1 = new String("s1");
		String s2 = new String("s1");
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		set.add(s1);
		set.add(s2);
		System.out.println(set);
		Integer t = new Integer(4);
	}

}

class People // 添加自定义类对象
{
	String name;

	public People(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return this.name;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		return true;
	}

//	public int hashCode()
//	{
//		return this.name.hashCode();
//	}
//
//	public boolean equals(Object o)
//	{
//		if (this == o)
//		{
//			return true;
//		}
//		if (null != o && o instanceof People)
//		{
//			People po = (People) o;
//			if (po.name.equals(this.name))
//			{
//				return true;
//			}
//		}
//		return false;
//	}

}
