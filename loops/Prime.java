
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner prime = new Scanner(System.in);
		int n=prime.nextInt();
	    int i=2;
        for(i=2;i<=n;i++) {
        	if(i%n==0) {
        		for(int j=2;j<i;j++) {
                	if(i%j==0) {
                	
                		break;
                	
                	}
        	}
        	
        	 
        }
        	
       		 System.out.println(i);
       	 
        }
      
	}
}