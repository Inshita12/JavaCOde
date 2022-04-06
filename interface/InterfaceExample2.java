
interface shape {
	void area(int a, int b);

	void perimeter(int a, int b);
}

interface tri extends shape {
	void volume(int a, int b, int c);
}
