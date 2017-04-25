package com.eclipse.patrickconway;

public class ChargeAccountTester
{

	public static void main(String[] args)
	{
		boolean crap = ChargeAccount.isValidAccount(5658845);
		if (crap == true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.print("not true");
		}

	}

}
