package com.enumeration;

public class EnumTest
{
	public static void doop(Operation operation)
	{
		switch (operation)
		// char byte short int enum ֻ����5������
		{
		case TURN_LEFT:
			System.out.println("turn left");
			break;
		case TURN_RIGHT:
			System.out.println("TURN RIGHT");
			break;
		case SHOOT:
			System.out.println("shoot");
			break;
		}
	}

	public static void main(String[] args)
	{
		doop(Operation.SHOOT);
	}
}

enum Operation
{
	TURN_LEFT, TURN_RIGHT, SHOOT
}