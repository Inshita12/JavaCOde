
import java.util.Scanner;

class MyException extends Exception{
	public String toString(){//object class method
		return "-ve values not allowed";
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter I value");
		int a=sc.nextInt();
		if (a<0)
			throw new MyException();
		}
		catch(MyException exe){
			System.out.println("Exception:"+exe);
		}
	}

}
