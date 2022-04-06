class Solution {

    public static String replaceCharacter(String input) {

        if (input.length() == 0) {
            return "";
        }
        return helper(input) + replaceCharacter(helper2(input));
    }

    public static char helper(String input) {
        return input.charAt(0);
    }

    public static String helper2(String input) {

        char first = input.charAt(0);
        while (input.charAt(0) == first) {
            if (input.length() == 1) {
                return "";
            }
            input = input.substring(1);
        }
        return input;
    }

    public static void main(String[] args) {
        String input = "aabccba";
        System.out.println(replaceCharacter(input));

    }
}