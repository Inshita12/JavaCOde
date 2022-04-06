package training;
public class Fibonacci {

    static int a = 0, b = 1, c;

    public static void fibnumber(int num) {
        if (num > 0) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibnumber(num - 1);
        }

    }

    public static void main(String[] args) {
        System.out.print(a + " " + b);
        int n = 13;
        fibnumber(n - 2);
    }

}
