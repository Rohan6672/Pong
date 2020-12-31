package Pong;

import java.util.Scanner;

public class hourglass {
	
	public static void main(String args[]){

	int NUM_LEVELS;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter NUM_LEVELS : ");

	NUM_LEVELS=sc.nextInt();

	  

	/*

	//Check for postive NUM_LEVELS  

	while(NUM_LEVELS<0)

	{

	System.out.println("NUM_LEVELS should be positive. Please enter again.");

	System.out.println("Enter NUM_LEVELS : ");

	NUM_LEVELS=sc.nextInt();

	}

	*/

	  

	final int c=NUM_LEVELS; //Copying NUM_LEVELS to final c variable to reduce typing

	  

	//Upper Quote Line

	System.out.print("|");

	int q = (c*2)+2;

	for(int i = 0;i<q;i++)

	{

	System.out.print("\"");

	}

	System.out.println("|");

	  

	//Upper Part of Hour Glass

	for(int i = 0;i<c;i++)

	{

	for(int j = 0;j<i+1;j++)

	{

	System.out.print(" ");

	}

	System.out.print("\\");

	for(int k = 0;k<(c-i)*2;k++)

	{

	System.out.print(":");

	}

	System.out.println("/");

	}

	  

	//Middle Part (Two Pipes)

	for(int j = 0;j<c+1;j++)

	{

	System.out.print(" ");

	}  

	System.out.println("||");

	  

	//Bottom Part of Hour Glass

	for(int i = c;i>0;i--)

	{

	for(int j = i;j>0;j--)

	{

	System.out.print(" ");

	}

	System.out.print("/");

	for(int k = (c-i)*2;k>=-1;k--)

	{

	System.out.print(":");

	}

	System.out.println("\\");

	}  

	  

	//Bottom Quote Line

	System.out.print("|");

	q = (c*2)+2;

	for(int i = 0;i<q;i++)

	{

	System.out.print("\"");

	}

	System.out.println("|");

	}

	}	

}
