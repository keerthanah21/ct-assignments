package assignment;
import java.util.Scanner;
public class weekday {
	//write a java program that keeps a number from the user and generates 
	//an integer between 1 and 7 and displays the name of the weekday
	      public  void wk()
	      {
	      int n;
	     String d;
	      Scanner b=new Scanner(System.in);
	      System.out.println("enter no btw 1-7");
	      
	      n=b.nextInt();
	      
	      switch(n)
	      {
	      case 1:  d ="monday"; break;
	      case 2:  d ="tue"; break;
	      case 3: d ="wed"; break;
	      case 4:  d ="thurs"; break;
	      case 5:  d ="friday"; break;
	      case 6: d ="saturday"; break;
	      case 7:  d ="sun"; break;
	      default: d ="u enter the wrg number";
	      
	      
	      
	      
	      }
	      System.out.println(d);
	      }

	public static void main(String[] args) {
	weekday obj=new weekday();
	obj.wk();
	}


}