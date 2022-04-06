public class InterfaceExample3 implements tri {
	public void area(int a, int b) {
		System.out.println("area=" + (a * b));
	}

	public void perimeter(int a, int b) {
		System.out.println("perimeter" + (2 * (a + b)));
	}

	public void volume(int a, int b, int c) {
		System.out.println("volume=" + (a * b * c));
	}

	public static void main(String[] args) {

		InterfaceExample3 ins = new InterfaceExample3();
		ins.area(6, 7);
		ins.perimeter(7, 4);
		ins.volume(1, 2, 3);

	}

}
