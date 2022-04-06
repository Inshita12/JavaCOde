

class solution {
    public static String helper(int n) {
        String[] ans = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        return ans[n - 2];
    }

    public static void print(String[] ans) {
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
        System.out.println("\n------------------------------");
    }

    public static String[] keypad(int n) {
        if (n == 0 || n == 1) {
            return new String[] { "" };
        }
        String lastvalue = helper(n % 10);
        String[] smallPart = keypad(n / 10);
        String[] ans = new String[lastvalue.length() * smallPart.length];
        int count = 0;
        for (int i = 0; i < smallPart.length; i++) {
            for (int j = 0; j < lastvalue.length(); j++) {
                ans[count++] = smallPart[i] + lastvalue.charAt(j);
            }
        }
        return ans;
    }
}

class runner {
    public static void print(String[] ans) {
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }

    public static void main(String[] args) {
        int input = 789;
        String output[] = solution.keypad(input);
        print(output);
    }
}