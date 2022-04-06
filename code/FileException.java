
package code;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		File f=new File("c:\\abc.txt");
		Scanner sc=new Scanner(f);
		int a=sc.nextInt();
		System.out.println(a);
	}catch(FileNotFoundException exe)
		{
			System.out.println(exe);
		}
		}

}
