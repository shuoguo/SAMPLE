package com.enumeration;

/**
 * 
 * @author SHUO GUO
 * 
 *         �����ÿ��ö�����Ͷ��̳���java.lang��enum �࣬ ��ԱĬ�� public static final
 */
public enum Coin
{ // ��Ա //ÿ����Ա ��һ��ö�����͵�ʵ���� ����ʱ��ȷ��
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
