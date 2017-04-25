package com.eclipse.patrickconway;

/**
 * Provides a static method for checking if input is a valid account
 * @author Patrick Conway
 *
 */
public final class ChargeAccount
{
	private static int[] accountNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
									8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
									1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
	
	/**
	 * Checks to see if the user provided account number is in the list
	 * @param accountNumber The user provided account number
	 * @return True if it's in the list; false if it isn't
	 */
	public static boolean isValidAccount(int accountNumber)
	{
		int index = 0;
		boolean accountFound = false;
		
		// Loop until either account is found or we reach the end of the array
		while (!accountFound && index < accountNumbers.length)
		{
			if (accountNumbers[index] == accountNumber)
			{
				// Early exit if we've found a match
				accountFound = true;
			}
			index++;
		}
		return accountFound;
	}
	
}
