class Solution {
    static int count = 0;

    public static int fib(int n) {
        count++;
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(fib(2));
        System.out.println(count);

    }
}

