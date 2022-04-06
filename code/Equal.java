package code;
import java.util.Scanner;

 class Equal {

	public static void main(String[] args) {
	
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		if(a==b && b==c && c==d && d==a) {
			System.out.println("Numbers are equal");
		}
		else {
			System.out.println("Numbers are not equal");
		}

	}

}