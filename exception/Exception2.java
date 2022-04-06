
import java.io.IOException;
import java.sql.SQLException;

public class Exception2 {
	//propogating an exception
	
	//the method when it doesn't want to handle the 
	//exception itself, raises a signal to the calling 
	//method by using the ----throws keyword
	
	//it means the method status() might raise the exception
	//IOException but will not handle it. the exception
	//must be handled by the calling method -which is the main()
	
	//a method can have >=1 exceptions in its throws list
	public void status() throws IOException, SQLException{
		System.out.println("The status method");
		
		throw new IOException();  //checked exception
		//	must be handled
		
	}
	public static void main(String[] args) {
		Exception2 obj = new Exception2();
		
//now the calling method handles the exception
//as the status() method has declared the exception in its throws list
		try {
			obj.status(); //compilation error, if not written in try catch block
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
