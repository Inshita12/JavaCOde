
/**
 * a
 */
package code;
import java.util.Scanner;

public class Fibonacci {
    static int a = 0;
    static int b = 1;
    static int i = 0;
    static int c;

    public static void Fibonnum(int n) {
       for(i=0;i<=n-1;i++) {
            c = a + b;
            a = b;
            b = c;
        }
       

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        Fibonnum(n);
        
        System.out.print(a);
        
    }
}

/**
 * a
 */
// import java.util.Scanner;

// public class Fibonacci {
//     static int a = 0;
//     static int b = 1;
//     static int i = 0;
//     static int c;

//     public static int Fibonnum(int n) {
     
//         return n== 0 || n == 1?n: Fibonnum(n - 1) + Fibonnum(n - 2);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         System.out.print(Fibonnum(n));

//     }
// }