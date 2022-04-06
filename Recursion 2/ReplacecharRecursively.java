class Solution {

    public static String replaceCharacter(String input, char c1, char c2) {
        if (input.length() == 0) {
            return " ";
        }
        if (input.charAt(0) == c1) {
            return input.replace(input.charAt(0), c2);
        }
        return input.charAt(0) + replaceCharacter(input.substring(1), c1, c2);
    }

    public static void main(String[] args) {
        String input = "abacd";
        char c1 = 'a';
        char c2 = 'x';
        System.out.println(replaceCharacter(input, c1, c2));

    }
}