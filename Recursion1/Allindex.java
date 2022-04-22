class Solution {
    public static int[] helper(int input[], int startIndex, int x) {
        if (startIndex == input.length) {
            int newarr[] = { };
            return newarr;
        }
        if (input[startIndex] == x) {
            int newarr[] = helper(input, startIndex + 1, x);
            int secarr[] = new int[newarr.length + 1];
            for (int i = 0; i < secarr.length - 1; i++) {

                secarr[i + 1] = newarr[i];
            }
            secarr[0] = startIndex;
            return secarr;
        } else {
            int newarr[] = helper(input, startIndex + 1, x);
            return newarr;
        }}
    public static int[] allIndexes(int input[], int x) {
        return helper(input, 0, x);
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }    public static void main(String[] args) {
        int input[] = { 9, 8, 8, 7, 8 };
        int x = 8;
        // int newarr[] = allIndexes(input, x);
        printarr(allIndexes(input, x));
 }}
