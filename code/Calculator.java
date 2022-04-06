package code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter 2 nos");
		Scanner sc = new Scanner(System.in);
		
		int a=0,b=0; float result=0;
		try{
			 a = sc.nextInt();			//java.util.InputMismatchException
			 b = sc.nextInt();			//java.util.InputMismatchException
			 System.out.println("Statement after accepting 2 values");
			 result = a/b;			//java.lang.ArithmeticException
			 System.out.println("statement after division");
			 
			 throw new NullPointerException();
		}
		//if we write the catch block with (Exception e) & other catch
		//block following it, it causes a compilation error -
		//unreachable code problem

		// always write the catch block (with Exception type ) after
		//all other catch blocks
		
		catch(InputMismatchException e){
			System.out.println(e);   //will print the exception details
			e.printStackTrace(); //will print the complete exception stack
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception occured");
			System.out.println("Check the second no");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally{
			//will be execute for sure
			//if the exception occurs or not
			
			//we write all the imp code here
			//closing files / network connections / database
			//any cleanup tasks and all
			System.out.println("will be executed in all cases");
		}
		
		System.out.println("Result of dividing"
		+a+" & "+b+" is "+result );
			
	}
}

/*
write the suspected code(which might raise an exception), inside try block
the try block must be followed by atleast one its family members
	i.e., by catch() or finally or both
there can't be any other lines of code  between try / catch /finally
write the catch block with appropriate/possible exception type(in parameter).

if an exception occurs, the matching catch block is immediately called,
skipping the rest of the statements written inside the try block.
that means, therez no guarantee that all the statements try are going to execute

 if no exception occurs, the catch doesn't execute.. so execution of catch
 & try block statements  is conditional
 --------------------------------------------------------------------------
 so where to write the most important code (which shouldn't be skipped) ??
 --------------------------------------------------------------------------


*/
		