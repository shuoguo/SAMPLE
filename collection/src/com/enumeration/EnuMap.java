package com.enumeration;

import java.util.EnumMap;
import java.util.Map;

public class EnuMap
{
	public static void main(String[] args)
	{
		// Map<Action, String> map = new EnumMap<Action, String>();
		Map<Action, String> map = new EnumMap<Action, String>(Action.class);

		map.put(Action.SHOOT, "shoot");
		map.put(Action.TURN_LEFT, "turnleft");
		map.put(Action.TURN_RIGHT, "turnright");

		for (Action a : Action.values())
		{
			System.out.println(map.get(a));// ¸ù¾Ýaction Êä³öË³Ðò
		}
	}
}

enum Action
{
	TURN_LEFT, TURN_RIGHT, SHOOT;
}