import java.util.Scanner;

public class TermsAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int terms;
		int count=1;
		for(i=1;i<=n;count++) {
			terms=(3*count)+2;
			if(terms%4!=0) {
				System.out.print(terms+" ");
			i++;
				
			}
		}
		

	}

}
