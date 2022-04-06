class solution {
    public static int multiplyTwoIntegers(int m, int n) {
        // Write your code here
        return (m == 0) ? 0 : n + multiplyTwoIntegers(m - 1, n);
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        System.out.println(multiplyTwoIntegers(m, n));

    }
}
