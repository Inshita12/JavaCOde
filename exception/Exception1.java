
import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public void display(){
		System.out.println("Enters the main");
		//throw new NullPointerException(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numeric value ");
		int no = sc.nextInt();
		
//All the subclasses of RuntimeException class r unchecked exceptions
//rest all the classes in exception hierarchy are checked exceptions		
		if(no==0){
//since IOException is a checkedException,
//it must be handled by the try/catch block
			try{
				throw new IOException();
			}
			catch(IOException e){
				System.out.println("The IO Catch Block");
			}
		}		
		else{
//since ArithmeticException is an uncheckedException,
//it's not a mandate to write it in try/catch
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) {
		
		
	}
}
