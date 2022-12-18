package assignment;
import java.util.Scanner;
public class sumandavg {
public static void main(String args[])
{
	System.out.println("sum and avg of inputs nos");
	int i,n=0,s=0;
	double avg;
	System.out.println("input the 5 no:");
	for(i=0;i<5;i++)
	{
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		s+=n;
		}
	avg=s/5;
	System.out.println("the sum of 5 no is:"+s+"\nThe avg is:"+avg);
	
}
}
 