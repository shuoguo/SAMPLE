package com.enumeration;

/**
 * 
 * @author SHUO GUO
 * 
 *         定义的每个枚举类型都继承自java.lang。enum 类， 成员默认 public static final
 */
public enum Coin
{ // 成员 //每个成员 是一个枚举类型的实例， 编译时即确定
	penny, nickel("bbb"), dime("ccc"), quarter("ddd");

	private String value;

	public String getValue()
	{
		return value;
	}

	Coin()
	{

	}
	Coin(String value)
	{
		this.value = value;
	}

	public static void main(String[] args)
	{
		Coin coin = Coin.quarter;
		System.out.println(coin.getValue());
	}
}
