import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int rev=0;
	
		while(temp>0) {
			int last=temp%10;
			temp=temp/10;
			rev=rev*10+last;
		}
		System.out.println(rev);
	}

}
