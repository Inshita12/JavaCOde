

import java.util.Scanner;

class MyException extends Exception{
	public String toString(){
		return "Wrong country name";
	}
}
public class ExceptionExample6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country name");
		String country=sc.nextLine();
		try{
		if(country.equalsIgnoreCase("india")==false){
			throw new MyException();
		}
		System.out.println("your country is"+country);
		}
	catch(MyException exe){
			System.out.println(exe);
		}
	finally{
		System.out.println("End");
	}
		}
	}


