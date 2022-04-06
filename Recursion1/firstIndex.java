class Solution {
    public static int helper(int input[], int startIndex, int x) {
        if (startIndex == input.length) {
            return -1;
        }
        if (input[startIndex] == x) {
            return startIndex;
        }
        return helper(input, startIndex + 1, x);
      
    }

    public static int firstIndex(int input[], int x) {
        return helper(input, 0, x);
    }

    public static void main(String[] args) {
        int input[] = { 34, 57, 82, 41, 65, 35, 82, 27, 36, 12, 6, 40, 66, 99, 25, 29, 22, 25, 12, 24, 65, 15, 5, 43,
                28, 33, 76, 32, 13, 95, 22, 84, 71, 23, 28, 7, 65, 94, 18, 47, 9, 42, 61, 73 };
        int x = 82;
        System.out.println(firstIndex(input, x));
    }
}