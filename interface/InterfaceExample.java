
interface a {
	int num = 89;

	public void show();
}

interface b extends a {
	public void getinfo();
}

class Demo implements b {
	public void show() {
		System.out.println("Interface method");
	}

	public void getinfo() {
		System.out.println("b interface method");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {

		Demo b1 = new Demo();
		b1.getinfo();
		b1.show();
	}

}
