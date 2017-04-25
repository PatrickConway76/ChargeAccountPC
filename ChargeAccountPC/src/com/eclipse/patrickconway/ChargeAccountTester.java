package com.eclipse.patrickconway;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChargeAccountTester
{

	public static void main(String[] args)
	{
		boolean keepGoing = true;
		boolean hasNumber;
		int accountNumber = 0;
		
		//Asks the user for an account number, compares it, reports the result, and repeats it until user enters -1
		while (keepGoing == true)
		{
			// Get the account number from the user
			accountNumber = mainMenu();
			
			// If user wants to exit then set the flag to exit
			if (accountNumber == -1)
			{
				keepGoing = false;
			}
			else
			{
				// Check to see if it's in the list
				hasNumber = ChargeAccount.isValidAccount(accountNumber);
				
				// Print the result
				if (hasNumber == true)
				{
					System.out.println(accountNumber + " is in the list.");
				}
				else
				{
					System.out.println(accountNumber + " is not in the list.");
				}
			}
		}
		
		// Exit application when done
		System.exit(0);
	}
	
	// Asks the user for an account number, returns it if it's valid input 
	private static int mainMenu()
	{
		Scanner sc = new Scanner(System.in);
		boolean isValidInput = false;
		int accountNumber = 0;
		
		// Keep asking forever until user enters an int
		while (isValidInput == false)
		{
			try
			{
				System.out.print("Please enter an account number to see if it's in the list or -1 to exit: ");
				accountNumber = sc.nextInt();
				isValidInput = true;
			}
			catch (InputMismatchException e)
			{
				String badInput = sc.next(); // Need to consume bad input
				System.out.println(badInput + " is invalid input. Please try again.");
			}
		}
		return accountNumber;
	}

}
