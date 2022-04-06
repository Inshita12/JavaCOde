class Solution {

    public static int digit(int n) {
 
        if (n < 10) {
            return 1;
        }
        return digit(n / 10) + 1;
    }

    public static void main(String[] args) {

        System.out.println(digit(124));

    }
}