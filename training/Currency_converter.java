package training;
import java.util.Scanner;
public class Currency_converter {
	
	static float dollar(int num) {
		float Dollar=74.1f;
		return num*Dollar;
	}
	
	static float pounds(int num) {
		float Pounds=100.7f;
		return num*Pounds;
	}
	
	
	public static void main(String[] args) {
	Scanner converter = new Scanner(System.in);
	int cc=converter.nextInt();
	System.out.println(dollar(cc)+"$");
	System.out.println(pounds(cc)+"£");
	}
	
}
