
import java.util.Scanner;

public class ExceptionExample2 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter a value");
		int b=sc.nextInt();
		try{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException exe){
			System.out.println(exe);
		}
		System.out.println("End of Program");

	}

}
