import java.util.Scanner;

public class Square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		long n=s.nextLong();
		long i=0;
	    while(i>=0) {
	    	if(i*i>n) {
	    		break;
	    	}
		i=i+1;
		}
	    System.out.println(i-1);
	}

}
