import java.util.*;

 class d {
    public static String helper1(int n) {
        String[] ans = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        return ans[n - 2];
    }

    public static void helper(int input, String output) {
        if (input == 0) {
            System.out.println(output);
            return;
        }
        int lastDigit = input % 10;
        String keyCode = helper1(lastDigit);
        for (int i = 0; i < keyCode.length(); i++) {
            helper(input / 10, keyCode.charAt(i) + output);
        }
    }

    public static void helper(int input) {
        helper(input, "");
    }

    public static void main(String[] args) {
        helper(234);
    }
}