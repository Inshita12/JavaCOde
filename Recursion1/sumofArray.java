class Solution {

    public static int sum(int input[]) {
        if (input.length == 1) {
            return input[0];
        }

        int smallAns[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallAns[i - 1] = input[i];
        }
        return input[0] + sum(smallAns);
    }

    public static void main(String[] args) {
        int input[] = { 1, 2, 3 };
        System.out.println(sum(input));
    }
}
// class Solution {

//     public static int helper(int input[], int startIndex) {

//         if (startIndex==input.length) {
//             return 0;
//         }

//         return input[startIndex] + helper(input, startIndex + 1);
//     }

//     public static int sum(int input[]) {
//         return helper(input, 0);

//     }

//     public static void main(String[] args) {
//         int input[] = { 1, 2, 8 };
//         System.out.println(sum(input));
//     }
// }