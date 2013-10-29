package com.enumeration;

public class Access
{
	public static boolean checkright(AccessRight accessright)
	{
		if (accessright == AccessRight.DEPARTMENT)
		{
			return true;
		}
		else if (accessright == AccessRight.EMPLOYEEE)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		AccessRight accessright = AccessRight.valueOf("MANAGER");
		System.out.println(checkright(accessright));
	}
}
