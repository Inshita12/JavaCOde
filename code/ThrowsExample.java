

import java.util.Scanner;

public class ThrowsExample {

	public static void main(String[] args) 
			throws ArithmeticException, ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter I value");
		int a=sc.nextInt();
		System.out.println("Enter II value");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("ans="+c);
		int arr[]={56};
		arr[12]=90;

	}
}