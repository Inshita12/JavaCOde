import java.util.Scanner;

public class Check {
public static void mai(String args[]) {
	float b[]=new float[5];
	Scanner s =new Scanner(System.in);
	for(int i=0;i<=5;i++) {
		b[i]=s.nextFloat();
	}
	for(int i=0;i<=5;i++) {
		if(b[i]%5==0) {
			b[i]*=2;
		}
		else {
			b[i]/=2;
		}
	}
	
	
}
}
