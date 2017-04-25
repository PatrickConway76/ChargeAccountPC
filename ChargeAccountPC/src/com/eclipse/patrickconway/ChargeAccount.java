package com.eclipse.patrickconway;

public final class ChargeAccount
{
	private static int[] accountNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
									8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
									1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
	
	public static boolean isValidAccount(int accountNumber)
	{
		int index = 0;
		boolean accountFound = false;
		
		while (!accountFound && index < accountNumbers.length)
		{
			if (accountNumbers[index] == accountNumber)
			{
				accountFound = true;
			}
			index++;
		}
		return accountFound;
	}
	
}
