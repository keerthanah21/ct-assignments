package assignment5;
import java.util.Scanner;
public class greatestnumber
{
	//take three numbers from the user and print the greatest number
	public void greatestnum()
	{
		int b,c;
		Float a;
		Scanner h=new Scanner(System.in);
		System.out.println("the greatest number of 3");
		System.out.println("enter the 1st number");
		a=h.nextFloat();
		System.out.println("enter the 2nd number");
		b=h.nextInt();
		System.out.println("enter the 3 rd number");
		c=h.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("the greatest number"+a);
		}
		else if(b>c)
		{
			System.out.println("the greatest number"+b);
		
		}
		else
		{
			System.out.println("the greatest number"+c);
		}
		}
	
	public static void main(String[] args) 
	{
	greatestnumber obj=new greatestnumber();
	obj.greatestnum();
	
		

	}

}
