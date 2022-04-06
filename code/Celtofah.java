package code;
import java.util.Scanner;

class celtofah {

	public static void celsiustofarhrenheit(int s, int e, int w) {
		for (int i = s; i <= e; i = i + w) {
			int celsius = (int) ((5.0 / 9) * (i - 32));
			System.out.println(i + " " + celsius);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		celsiustofarhrenheit(s, e, w);
	}
}
