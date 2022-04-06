import java.util.Scanner;

public class bindec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int pow=1;
		int dec=0;
		while(n>0) {
			int temp=n%10;
			dec+=temp*pow;
			pow*=2;
			n=n/10;
		}
        System.out.println(dec);
	}
}
