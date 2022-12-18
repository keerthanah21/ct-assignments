package assignment;
import java.util.Scanner;
//wap to take product info using scanner like productid,productname,productprize,quantity,category,brand and display
public class productinformation
	{
	public  void pf() {
	 System.out.println(" storing of product information "); 
     int prod_id ,quantity; 
     float prod_price; 
     String prod_name,category,brand; 
	      Scanner b=new Scanner(System.in); 
		       System.out.println("enter no of details"); 
		       int n=b.nextInt(); 
		       for(int i=0;i<n;i++) 
		       { 
		        System.out.println("enter product id"); 
		        prod_id=b.nextInt(); 
		        System.out.println("enter quantity"); 
		        quantity=b.nextInt(); 
		        System.out.println("enter product name"); 
		        prod_name=b.next(); 
		        System.out.println("enter category type"); 
		        category=b.next(); 
		        System.out.println("enter brand name"); 
		        brand=b.next(); 
		        System.out.println("enter product price"); 
		        prod_price=b.nextFloat(); 
		 
		        System.out.println(prod_id); 
		        System.out.println(quantity); 
		        System.out.println(prod_name); 
		        System.out.println(category); 
		        System.out.println(brand); 
		        System.out.println(prod_price); 
		       } 
		          
		      } 
		  public static void main(String[] args)
		  { 
		   productinformation obj = new productinformation(); 
		  obj.pf();
		       
		      } 
		  } 

		  

		

	

