

import java.util.Scanner;

public class ExceptionExample4 {
	public static void show(){
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
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter a value");
		int b=sc.nextInt();
		try{
			int c=a/b;
			System.out.println(c);
			show();
			int arr[]={56};
			arr[3]=78;
		}
		catch(ArithmeticException exe){
			System.out.println(exe);
		}
		catch(ArrayIndexOutOfBoundsException ab){
			ab.printStackTrace();
		}

	}

}
