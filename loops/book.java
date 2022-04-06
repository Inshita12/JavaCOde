 import java.util.Scanner;

public class book{
	public static void main(String args[]) {
	
		Scanner s =new Scanner(System.in);
		 
		 String title=s.nextLine();
		 String publications= s.nextLine();
		 String author=s.nextLine();
		 
		 Scanner b =new Scanner(System.in);
		 int bookNo= s.nextInt();
		 float price= s.nextFloat();		
		System.out.println("Book Number is:"+ bookNo);
		System.out.println("Book title is:"+ title);
		System.out.println("Book publications is:"+ publications);
		System.out.println("Book author is:"+ author);
		System.out.println("Book Price is Rs.:"+price);
	 }
}