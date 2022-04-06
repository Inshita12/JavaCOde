

import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter a value");
		int b=sc.nextInt();
		try{
			int c=a/b;
			System.out.println(c);
			int arr[]={56};
			arr[3]=78;
		}
		catch(ArithmeticException exe){
			System.out.println(exe);
		}
		catch(ArrayIndexOutOfBoundsException ab){
			ab.printStackTrace();
		}
		catch(Exception e)//this catch should be the last.
		{
			e.printStackTrace();
		}
		finally{
		
			System.out.println("End");
		}

	}

}
