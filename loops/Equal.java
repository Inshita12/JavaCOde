import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
