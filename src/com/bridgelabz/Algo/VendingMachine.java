package com.bridgelabz.Algo;

import java.util.Scanner;

public class VendingMachine {

	/*
	 * static variable I is declared to change notes and Static variable TOTAL is
	 * declared to count total notes
	 */
	static int I, TOTAL;

	/*
	 * Static array to store values of notes
	 */
	static int[] NOTES = { 1000, 500, 100, 50,20, 10, 5, 2, 1 };

	/**
	 * Function to find the notes and print the output
	 * 
	 * @param value the amount to which the note to despenced
	 */
	static void notes(int value) 
	{
		while (value / NOTES[I] != 0) 
		{
			TOTAL += (value / NOTES[I]);
			System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
			value = value % NOTES[I];
		}
		I++;
		if (value == 0)
		{
			System.out.println("total notes :" + TOTAL);
			return;
		}

		notes(value);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter amoumt");
			int value = s.nextInt();
			notes(value);
			s.close();
		} 
		catch (Exception e) 
		{
			System.out.println("enter value in integer");
		}

	}

}
