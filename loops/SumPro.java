import java.util.Scanner;

public class SumPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		int sum=0;
		int product=1;
		int i;
		for(i=1; i<=n;i++) {
			if(c==1) {
				sum=sum+i;			
			}	
			if(c==2) {
				product=product*i;
			}
		}
		if(c==1) {
			System.out.println(sum);
		}
		else if(c==2) {
		System.out.println(product);
		}
		else {
			System.out.println(-1);
		}
	}

}
