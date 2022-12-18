package assignment;

import java.util.Scanner;

public class positiveornegative {
	//write a java program to get a number from the user and print whether its positive or negative
	public  void posorneg()
	{
	int n;
	Scanner k=new Scanner(System.in);
	System.out.println("enter a num");
	n=k.nextInt();
	if(n>0)
	{
		System.out.println("num is positive");
	}
	else if(n<0)
	{
		System.out.println("num is negative");
	}
	else
	{
		System.out.println("num is zero");
	}
	}

	public static void main(String[] args)
	{
		positiveornegative obj=new positiveornegative();
		obj.posorneg();

	}

}
